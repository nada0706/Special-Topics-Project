curl -X DELETE "localhost:9200/client"
curl -X PUT "localhost:9200/client"
curl -X PUT "localhost:9200/client/_mapping" -H "Content-Type: application/json" -d @clientmapping.json
curl -s -H "Content-Type: application/json" -X POST "localhost:9200/client/_bulk" --data-binary @client.json

curl -X DELETE "localhost:9200/leads"
curl -X PUT "localhost:9200/leads"
curl -X PUT "localhost:9200/leads/_mapping" -H "Content-Type: application/json" -d @leadsmapping.json
curl -s -H "Content-Type: application/json" -X POST "localhost:9200/leads/_bulk" --data-binary @leads.json