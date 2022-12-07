# Banibis

## Ziel: 
  - die Rechnungen (documents)  über die API herunterladen und in ein JAVA Objekt konvertieren   
  - Kunden (clients) über die API herunterladen und in ein JAVA Objekt konvertieren


# Entwicklungsumgebung: 
- https://www.eclipse.org/downloads/


# Daten:
- Einen Testaccount auf billdu.com kannst du unter deiner E-Mai Adresse machen – ist kostenlos und sofort verfügbar:
- https://my.billdu.com/start-invoicing
- Rechnungen und Kunden Daten anlegen und über die API herunterladen.



# API 
- https://billdu.docs.apiary.io/#introduction/api-clients

Für dich interessant sind die Calls:
- 
- Listet Alle Dokumente auf
https://billdu.docs.apiary.io/#reference/documents/documents/list-all-documents?console=1
- 
- Listet alle Kunden auf 
https://billdu.docs.apiary.io/#reference/clients/clients/list-all-clients?console=1



Wenn du für die Signaturberechnung mehr als 2h benötigst, dann bitte brich ab und kontaktiere uns lieber, wir haben eine valide Signaturberechnung.

# TIPPS

## JSON CONVERTER
Als keinen Tipp fürs Übersetzen von JSON > Java Object gibt es ein nettes kleines Util von Google namens GSON:
- https://github.com/google/gson

Spannend für das Übersetzen könnte auch sein, einen eigenen kleinen Deserialize Adapter für Datumsfelder zu schreiben.
- https://stackoverflow.com/questions/8650913/gson-deserializer-for-java-util-date

