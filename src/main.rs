use std::*;
pub mod config {
    pub mod conf;
} 

fn main() {
// let trigger: bool = true;

    config::conf::call_modelname();

/*    let greeting = vec![
    "Hello! I am {}",
    "Example1",
    "Example2",
    ];
 */
    println!("H!");
}
