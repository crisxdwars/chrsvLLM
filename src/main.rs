use std::*;
pub mod config {
    pub mod conf;
} 

fn main() {
    let mut _trigger: bool = true;
    let mut _input = String::new();
    // const _DEFAULT: &str = "$";
    while _trigger {
        // print!("{}", _DEFAULT);
        io::stdin()
        .read_line(&mut _input)
        .expect("An error occured.");

        if _input.contains("chrs") {
            println!("
            Do you need help?
            \n\n\r
            Commands: \n
            => 'brun' Run basic chatbot for help.\n
            => 'stop' Stop this program.  
            ");
        } 
        if _input.contains("stop") {
            println!("Program stopped.");
            _trigger = false;  
        }
    }

    // config::conf::call_modelname();
}
