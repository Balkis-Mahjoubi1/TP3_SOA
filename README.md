# **Calculatrice REST - TP3 Architecture Orientée Services (SOA)**

## 📋 **Description du Projet**
Application web RESTful implémentant une calculatrice distribuée selon les principes de l'Architecture Orientée Services (SOA). L'application expose une API REST complète avec les quatre opérations arithmétiques fondamentales.

## 🚀 **Fonctionnalités**
- **API REST** pour les opérations arithmétiques
- **Interface web interactive** avec calculatrice en temps réel
- **Format JSON** pour toutes les réponses
- **Gestion d'erreurs** (division par zéro)
- **Documentation intégrée** dans l'interface

## 🛠️ **Technologies Utilisées**
- **Backend** : Java 11, Jakarta EE 10
- **Framework REST** : JAX-RS (Jersey 3.1.9)
- **Sérialisation** : JSON-B
- **Serveur** : Apache Tomcat 10.1.50
- **Build** : Maven
- **Frontend** : HTML5, CSS3, JavaScript

## 📁 **Structure du Projet**
```
TP3_Projet/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/calculatrice/
│   │   │       ├── Calculatrice.java      # Logique métier
│   │   │       ├── CalculRest.java        # Contrôleur REST
│   │   │       ├── Operation.java         # Modèle de données
│   │   │       └── RestApplication.java   # Configuration JAX-RS
│   │   ├── resources/
│   │   └── webapp/
│   │       ├── META-INF/
│   │       │   └── context.xml
│   │       ├── WEB-INF/
│   │       │   ├── beans.xml
│   │       │   └── web.xml
│   │       └── index.html                 # Interface utilisateur
│   └── test/
└── pom.xml                                # Configuration Maven
```

#### **Option A : Via IntelliJ (Smart Tomcat)**
1. Configurer Smart Tomcat dans IntelliJ
2. Spécifier le dossier Tomcat : `C:\tomcat10`
3. Context Path : `/TP3_Projet`
4. Port : `8080`

#### **Option B : Déploiement manuel**
```bash
# Copier le fichier WAR dans webapps de Tomcat
cp target/TP3_Projet.war C:\tomcat10\webapps\

# Démarrer Tomcat
C:\tomcat10\bin\startup.bat
```

## 📡 **API Endpoints**

### **Opérations disponibles**
Tous les endpoints retournent du JSON et utilisent la méthode GET.

| Opération | Endpoint | Paramètres | Exemple |
|-----------|----------|------------|---------|
| Addition | `/api/calcul/addition` | `a`, `b` | `?a=10&b=5` |
| Soustraction | `/api/calcul/soustraction` | `a`, `b` | `?a=10&b=5` |
| Multiplication | `/api/calcul/multiplication` | `a`, `b` | `?a=10&b=5` |
| Division | `/api/calcul/division` | `a`, `b` | `?a=10&b=5` |

### **Format de réponse**
```json
{
  "type": "addition",
  "nombre1": 10.0,
  "nombre2": 5.0,
  "resultat": 15.0,
  "message": "Addition effectuée avec succès"
}
```

## 🌐 **Utilisation**

### **Via l'interface web**
1. Accédez à : `http://localhost:8080/TP3_Projet/`
2. Entrez deux nombres
3. Cliquez sur une opération
4. Le résultat s'affiche en temps réel

### **Via cURL**
```bash
curl -X GET "http://localhost:8080/TP3_Projet/api/calcul/addition?a=15&b=3"
```

### **Via navigateur**
```
http://localhost:8080/TP3_Projet/api/calcul/soustraction?a=20&b=7
```

## 🐛 **Dépannage**

### **Problèmes courants**

#### **Port 8080 déjà utilisé**
```cmd
# Trouver le processus utilisant le port
netstat -ano | findstr :8080

# Tuer le processus (remplacez PID)
taskkill /PID [PID] /F
```

## 📊 **Tests**

### **Tests manuels de l'API**
1. **Addition** : http://localhost:8080/TP3_Projet/api/calcul/addition?a=10&b=5
2. **Soustraction** : http://localhost:8080/TP3_Projet/api/calcul/soustraction?a=10&b=5
3. **Multiplication** : http://localhost:8080/TP3_Projet/api/calcul/multiplication?a=10&b=5
4. **Division** : http://localhost:8080/TP3_Projet/api/calcul/division?a=10&b=5
5. **Division par zéro** : http://localhost:8080/TP3_Projet/api/calcul/division?a=10&b=0

## 📝 **Configuration**

### **Fichier pom.xml**
```xml
<properties>
    <maven.compiler.source>11</maven.compiler.source>
    <maven.compiler.target>11</maven.compiler.target>
    <jakarta.version>10.0.0</jakarta.version>
    <jersey.version>3.1.9</jersey.version>
</properties>
```

### **Fichier web.xml**
Configuration JAX-RS avec package scanning pour `org.example.calculatrice`

## 🎯 **Objectifs pédagogiques**
- Comprendre les principes SOA
- Implémenter des services web RESTful
- Utiliser Jakarta EE et JAX-RS
- Déployer une application web sur Tomcat
- Créer une interface utilisateur interactive

## 📈 **Améliorations possibles**
- [ ] Ajouter des tests unitaires (JUnit)
- [ ] Implémenter l'authentification JWT
- [ ] Ajouter la persistance des calculs
- [ ] Créer une documentation OpenAPI/Swagger
- [ ] Dockeriser l'application
- [ ] Ajouter des opérations avancées (puissance, racine)

## 👥 **Auteurs**
- **Balkis Mahjoubi** - Développement et documentation

## 📄 **Licence**
Ce projet est réalisé dans le cadre académique - Module LS13 SOA


