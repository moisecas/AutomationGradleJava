rootProject.name = "automatizacionOne"
include("src:test:steps")
findProject(":src:test:steps")?.name = "steps"
