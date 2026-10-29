Graphics3D 640,480
SetBuffer BackBuffer()

camera = CreateCamera()
CameraClsColor camera,0,255,0
PositionEntity camera,0,1.2,0

player = CreatePivot()
PositionEntity player,0,1.2,0

EntityParent camera,player
PositionEntity camera,0,0,0

light = CreateLight()

scene = LoadMesh("ss.b3d")

HidePointer
MoveMouse 320,240
mouseSensitivity# = 0.2
pitch# = 0

footstepSound = LoadSound("1027.mp3")

While Not KeyDown(1)


mx# = MouseXSpeed() * mouseSensitivity#
my# = MouseYSpeed() * mouseSensitivity#

TurnEntity player,0,-mx#,0


pitch# = pitch# + my#

If pitch# > 89 Then pitch# = 89
If pitch# < -89 Then pitch# = -89

RotateEntity camera,pitch#,0,0

MoveMouse 320,240

speed# = 0.02


If KeyDown(42) Then speed# = 0.05

If KeyDown(200) Then MoveEntity player,0,0,speed#

If KeyDown(208) Then MoveEntity player,0,0,-speed#

If KeyDown(203) Then MoveEntity player,-speed#,0,0

If KeyDown(205) Then MoveEntity player,speed#,0,0



moving = False

If KeyDown(200) Or KeyDown(208) Or KeyDown(203) Or KeyDown(205) Then
    moving = True
EndIf



moving = False

If KeyDown(200) Or KeyDown(208) Or KeyDown(203) Or KeyDown(205) Then
    moving = True
EndIf

If moving Then

    bobSpeed# = 5
    bobAmount# = 0.025

    If KeyDown(42) Then
        bobSpeed# = 10
        bobAmount# = 0.045
    EndIf

    bobTime# = bobTime# + bobSpeed#
    targetBob# = Sin(bobTime#) * bobAmount#


    currentStep = Floor(bobTime# / 350)

    If currentStep > lastStep Then
        PlaySound footstepSound
    EndIf

    lastStep = currentStep

Else


    targetBob# = 0

EndIf

bobOffset# = bobOffset# + (targetBob# - bobOffset#) * 0.15


PositionEntity camera,0,bobOffset#,0

    RenderWorld
    Flip

Wend

ShowPointer
End

