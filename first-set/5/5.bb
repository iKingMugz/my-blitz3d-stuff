Graphics3D 640,480
SetBuffer BackBuffer()

camera = CreateCamera() 
CameraClsColor camera,0,255,0

light = CreateLight()

bottle = LoadMesh("Untitled.3DS")
PositionEntity  bottle,0,0,5 
ScaleEntity bottle,0.1,0.1,0.1

While Not KeyDown(1) 

;if [condition] then [do something]
If KeyDown(203) Then TranslateEntity bottle,-0.1,0,0 
If KeyDown(205) Then TranslateEntity bottle,0.1,0,0 
If KeyDown(208) Then TranslateEntity bottle,0,-0.1,0 
If KeyDown(200) Then TranslateEntity bottle,0,0.1,0 


RenderWorld 
Flip 

Wend 

End 
