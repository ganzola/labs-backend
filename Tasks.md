Ejercicio.

- [X] **1** Clone el repositorio del backend del proyecto.
- [X] **2** Clone el repositorio del frontend del proyecto.
- [X] **3** Lea atentamente la introducción y explicación de los Frameworks (siguiente sección).
- [X] **4** Implemente los siguientes requisitos:
    - [ ] **a** En la vista de Login del proyecto de frontend, al iniciar sesión de forma exitosa
      aparece un alert que confirma cuándo se ha almacenado el token de acceso en el
      localstorage. Quite el alert y haga que al confirmar el inicio de sesión redirija a la
      página Home (a través del path “/principal”)
    - [X] **b** Desarrolle un servicio en Spring que retorne los cursos a los cuales está inscrito
      un usuario autenticado del sistema. Especificar si está asociado como profesor o como estudiante. Recuerde que se
      debe identificar el usuario por el token de sesión. (Todos los usuarios tienen contraseña del 1 al 5 - 12345).
    - [ ] **c** Desarrolle una vista en donde pueda visualizar los resultados proveídos por el
      punto b.
    - [X] **d** Desarrolle un servicio en Spring que retorne como respuesta la lista de roles que
      posee el usuario autenticado en el sistema. Debe identificarlo por el token de
      acceso.
    - [ ] **e** La página principal (Home) renderiza el título general de la página (en el path
      “/principal”). También incluye un componente de forma jerárquica que permite
      realizar la adición de un rol nuevo para el usuario (en el path
      “/principal/nuevo-rol”). Adicione un nuevo componente como hijo de la vista
      Home que presente el resultado del servicio desarrollado en el punto anterior (en
      el path “/principal/roles”).
    - [X] **f** Desarrolle un servicio en backend que le permita a un docente crear un curso a
      través del path “/profesor/crear-curso”.
    - [ ] **g** Adicione un componente hijo a la vista Home que muestre a los usuarios con rol
      de profesor, un formulario de creación del curso mediante el cual se consuma el
      servicio desarrollado en el punto f.

- [ ] **5** Grabe un video corto (de máximo 10 minutos) donde deberá mostrar su solución a cada
  punto funcionando correctamente.
- [ ] **6** Suba el video a una plataforma que permita la reproducción (como YouTube or Google
  Drive) y compartirlo.