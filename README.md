# Spring-Boot Camel QuickStart

Imagen  Base
### Instalar
mvn clean install

### Crear configmap y  secrets
#Secretos
oc create  -f   secret.yml
#Confimap propepiedades
oc create configmap ws-insertar-movimiento --from-literal=quickstart.usuariodb=postgres --from-literal=quickstart.passwddb=wana1200

### Desplegar en  OpenShift

mvn clean -DskipTests fabric8:deploy -Popenshift


To list all the running pods:

    oc get pods

Log
    oc logs <name of pod>


