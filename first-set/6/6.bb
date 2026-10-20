	Graphics3D 640,480
	SetBuffer BackBuffer()
	
	camera = CreateCamera() 
	CameraClsColor camera,0,255,0
	PositionEntity camera,0,1.2,0
	
	light = CreateLight()
	
	scene = LoadMesh("s.b3d")
	
	While Not KeyDown(1) 
	
	;if [condition] then [do something]
	If KeyDown(203) Then TranslateEntity camera,-0.1,0,0 
	If KeyDown(205) Then TranslateEntity camera,0.1,0,0 
	If KeyDown(208) Then TranslateEntity camera,0,0,-0.1
	If KeyDown(200) Then TranslateEntity camera,0,0,0.1
	
	
	RenderWorld 
	Flip 
	
	Wend 
	
End 
