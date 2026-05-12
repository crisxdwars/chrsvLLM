/* 
    Hello! This will be the configuration of the information of 
    so Called.. 
        "Large Language Model" (LLM).
    I am planning to make this ai learn through: 
    -- .txt
    -- .pdf 
    -- .docx
*/ 


struct ModelConfig {
    model_name: String,
    model_owner: String,
    // Adding more configuration soon!
}

pub fn call_modelname() {
    let model = ModelConfig {
        model_name: String::from("Chrsv"), // Change this to anything you wanted.
        model_owner: String::from("Christian Talurong"),  // Change this to your name, So the LLM can say that you're the owner of this model.
    };

    println!("Model Name: {}", model.model_name);
    println!("Model Creator: {}", model.model_owner);
}