class BootStrap {

    def init = { servletContext ->
		new DevData().insert()
    }
    def destroy = {
    }
}
