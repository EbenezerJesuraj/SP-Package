// 17PT13 - Software Patterns Lab Exam - 15XT97              



public static class Principal(){            // Priority Level 1

    private string complaint;

    public boolean SolveIssue(){

        ///
        ///  ... Issue Solving Code
        ///
        CloseTicket();
        
    }

    public static class HoD(){              // Priority Level 2

        
        private string complaint;

        public boolean SolveIssue(){

                ///
                ///  ... Issue Solving Code
                ///
                CloseTicket();
        }

        public boolean RaiseTicket(){

            TicketUpdation();
        }
            
        public static class PC(){           // Priority Level 3

            private string complaint;

            public boolean SolveIssue(){
                 
                ///
                ///  ... Issue Solving Code
                ///
                CloseTicket();
            }

            public boolean RaiseTicket(){

                TicketUpdation();
            }

            public static class Tutor(){     // Priority Level 4

                private string complaint;
                
                public boolean SolveIssue(){
                    
                    ///
                    /// ... Issue Solving Code
                    ///
                    CloseTicket();
                    
                }

                public boolean RaiseTicket(){
                    TicketUpdation();
                }

                public static class ComplaintManager(User &U){

                    private string complaint;
                    private int priority;
                    private User U;
                    public boolean ReceiveComplaint(){
                            this.complaint = U.GetComplaint();
                    }

                    public boolean OpenTicket(){
                        
                        this.priority = 4;
                    }

                    public boolean TicketUpdation(){

                        this.priority-=1;
                    }

                    public boolean CloseTicket(){
                        this.priority=0;
                        print("Hopefully Your Issue has been resolved");
                    }

                }
            }
        }
    }
}

//Builder Class
public static class User(){

    private string complaintstring;

    public string SetComplaint(){

        this.string = input("Enter your Complaint: ")
    }

    public string GetComplaint(){

        return this.complaintstring;
    }

}

public void main(){

    User U;
    U.SetComplaint();

    ComplaintManager(U);
}