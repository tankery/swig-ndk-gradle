/* File : hello.i */
%module hello

%include <std_string.i>

%inline %{
extern std::string get_hello();
%}