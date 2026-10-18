Graphics3D 640,480
SetBuffer BackBuffer()

camera = CreateCamera()
CameraClsColor camera,0,0,255

light = CreateLight()

sphere = CreateSphere(32)
PositionEntity  sphere,0,0,5 
ScaleEntity sphere,0.5,0.5,0.5
EntityColor sphere,255,0,0 ;r, g, b,
EntityAlpha sphere,0.5


While Not KeyDown(1) 


RenderWorld 
Flip 

Wend 

End 
