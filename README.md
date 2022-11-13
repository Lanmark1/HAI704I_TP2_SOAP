# HAI704I TP2 - Web service SOAP
TP réalisé par :
- BENTOLILA Jeremie
- REYNE Yoann

## Pré-requis

- Système unix (recommandé)
- Make
- Maven
- Java JRE

## Installation

- Récupérer une archive de notre Projet (recommandé) 
- Se placer à la racine et exécuter les commandes suivantes dans trois terminaux de commandes :

### Premier terminal
Compiler les différents projets, lancer le web service des hôtels :

```bash
make compile
make pHotelWS
```

### Deuxième terminal

Lancer le web service des agences :

```bash
make pAgenceWS
```

### Troisième terminal

Lancer l'interface client :

```bash
make gui
```
De manière générale, si vous avez un doute quant aux rôles des commandes :
```makefile
make help
```
## Utilisation

- Remplir les critères désirés

- (Villes disponibles : )
    - Paris
    - Montpellier
    - Nice
- Consulter les offres répondant à ses critères
- Effectuer une réservation parmi les offres obtenues
- Accéder à l'historique des réservations
