# Spring AI demos

These are the Spring AI/OpenAI demos shown in DevXplaining Youtube channel.

<https://www.youtube.com/c/DevXplaining>

If you want to run these codes you need to set up your OpenAI API key to environment variables first.

```bash
export OPEN_AI_API_KEY=your_openai_api_key
```

Then you can run the demos with Maven.

```bash
mvn spring-boot:run
```

REST API will be available at `http://localhost:8080`. Two demos are in:

<http://localhost:8080/robobrain/musashi>
<http://localhost:8080/robobrain/rag>

For PDF reading example source is TIOBE.pdf that's simply a snapshot of TIOBE index page at <http://www.tiobe.com/tiobe-index/>
