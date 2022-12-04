# Special-Topics-Project

Lead management is the process of gathering leads, tracking all interactions with your company, such as email, chat, or website activity, and qualifying and engaging them until they buy your product. The five stages below comprise an effective and efficient lead management procedure:
•	Lead capturing: email, website, social media, webinars, and sponsored advertisements are all ways to reach out to potential buyers during lead generation operations. A strong lead management software guarantees that every lead from web forms, emails, and chat is automatically fed into the CRM system, preventing prospects from sliding through the cracks.

•	Lead enrichment & tracking: employees, whether in sales or marketing operations, should not be wasting time seeking for information on each lead or manually entering data. A lead management software populates a lead's profile with publicly accessible information such as their job title, location, time zone, business name, etc. These useful information provides your marketing team with the necessary background for crafting email messages.

•	Lead qualification: a contact scoring model—a model that grades your customers based on their interest in your product or service, demographic information, purchasing path, and interaction with your company—is one efficient approach to qualify leads.

•	Lead distribution: the sooner your sales staff contact leads, the more probable it is that they will convert them. Manually allocating a high number of leads to the appropriate sales agents can be time-consuming and cause lead response time to be delayed. A good lead management system assigns leads and phone numbers to salespeople across territories and transfers calls to sales teams.

•	Lead nurturing: not all of your leads are ready to buy. Many of them may still be in the research or awareness phase, attempting to determine whether your solution would alleviate their pain points. Lead nurturing aims to educate and illustrate the worth of your product or service.



Actors:
Use cases:
Data model:
-	Lead
-	Customer

Restful API:
Search of Leads

GET /api/v1/leads

Search leads by status

GET /api/v1/leads?status=active


USE CASES Diagrams
![use case restapi drawio](https://user-images.githubusercontent.com/92259283/203331057-1dbfba70-5ecc-4ac8-bae0-51130402ccd2.png)
![use cases lead drawio](https://user-images.githubusercontent.com/92259283/203331135-043c2fed-854e-4879-b573-59d9cbea97ef.png)
![use case client drawio](https://user-images.githubusercontent.com/92259283/203331153-760a9042-0a55-488f-b892-28f47d94c139.png)






POST client/_doc
{
  "username": "Mary Johnson",
  "firstName": "John",
  "lastName": "James",
  "email": "john@email.com"
}

GET client/_search

POST client/_bulk
{"index": {"_id": "1"}}
{"username": "Nada Ahmed", "firstName": "Nada", "lastName": "Ahmed", "email": "nada@email.com"}
{"index": {"_id": "2"}}
{"username": "Cata Sibisanu", "firstName": "Cata", "lastName": "Sibisanu", "email": "cata@email.com"}
{"index": {"_id": "3"}}
{"username": "Kata Ampleev", "firstName": "Kata", "lastName": "Ampleev", "email": "kata@email.com"}
{"index": {"_id": "4"}}
{"username": "Yasmin Hamid", "firstName": "Yasmin", "lastName": "Hamid", "email": "yasmin@email.com"}

POST leads/_doc
{
  "id": 1,
  "name": "lead1",
  "status": "activated"
}

GET leads/_search

POST leads/_bulk
{"index": {"_id": "2"}}
{"name": "lead2", "status": "activated"}
{"index": {"_id": "3"}}
{"name": "lead3", "status": "deactivated"}
{"index": {"_id": "4"}}
{"name": "lead4", "status": "deactivated"}
{"index": {"_id": "5"}}
{"name": "lead5", "status": "activated"}

GET _cat/indices

GET leads/_mapping

GET client/_mapping



