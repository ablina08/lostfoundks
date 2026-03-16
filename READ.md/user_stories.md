User Stories Document — Lost & Found KS
1) Roles in the App

In Lost & Found KS the main types of users (roles) are:

Visitor – An unregistered user who can browse the list of lost items.
Registered User – A user who has an account and can report and manage lost items.
Admin – A privileged user who can oversee and manage all items and reports.

These roles help define who can do what in the app and guide the user stories below.

2) User Stories + Acceptance Criteria + Priority (MoSCoW)
🔴 MUST HAVE (Critical features)

User Story 1 – View Lost Items
As a Visitor,
I want to view lost item listings
so that I can see what objects have been reported lost in Kosovo.

Acceptance Criteria:

Given there are lost items in the system  
When a visitor opens the item list page  
Then they see all lost items with name, city, and description

Priority: Must Have

User Story 2 – Report Lost Item
As a Registered User,
I want to report a lost item
so that other users can see it and help find it.

Acceptance Criteria:

Given I am logged in  
When I submit a lost item report (name, city, description)  
Then the lost item appears in the lost items list

Priority: Must Have

User Story 3 – Edit My Lost Item
As a Registered User,
I want to edit my lost item report
so that I can correct details if I made a mistake.

Acceptance Criteria:

Given I am logged in and on my own item page  
When I update item details and save  
Then the system shows the updated name, city, and description

Priority: Must Have

🟠 SHOULD HAVE (Important but not essential for MVP)

User Story 4 – Delete Item
As a Registered User,
I want to delete my lost item report
so that outdated or incorrect reports can be removed.

Acceptance Criteria:

Given I am on my item page  
When I click delete and confirm  
Then the item is removed from the lost items list

Priority: Should Have

User Story 5 – Search by City
As a Visitor,
I want to search lost items by city
so that I can find items lost in my area.

Acceptance Criteria:

Given items exist from multiple cities  
When I search by city  
Then only items from that city are shown

Priority: Should Have

🟢 COULD HAVE (Nice‑to‑have features)

User Story 6 – Add Photo to Item
As a Registered User,
I want to add a photo to my lost item
so that other users can visually identify it more easily.

Acceptance Criteria:

Given the upload accepts valid images  
When I attach a photo and save  
Then the photo is shown with the item details

Priority: Could Have

User Story 7 – Notifications for Matches
As a Registered User,
I want to receive notifications when my lost item matches a found item
so that I know quickly when someone reports a possible match.

Acceptance Criteria:

Given a found item is reported that matches mine  
When the system detects the match  
Then I receive a notification (email or in‑app alert)

Priority: Could Have

⚪ WON’T HAVE (Not in this semester)

User Story 8 – Reports for Admin
As an Admin,
I want to generate downloadable reports of lost items
so that I can analyze trends over time.

Acceptance Criteria:

Given I am logged in as Admin  
When I click “Generate Report”  
Then the system prepares a downloadable file  
(This feature is not planned for this semester)

Priority: Won’t Have

3) Prioritization (MoSCoW method)

MoSCoW is a prioritization technique used to decide which features are most important:

Must Have – core functionality the app needs to work.

Should Have – important enhancements that are not critical for first delivery.

Could Have – useful improvements that can be added later.

Won’t Have – explicitly out of scope for this release or semester.

4) INVEST Quality Criteria

Each user story should follow the INVEST principle to ensure quality and testability:

🔹 Independent – can be developed on its own
🔹 Negotiable – flexible and discussable
🔹 Valuable – delivers meaningfully for the user
🔹 Estimable – possible to estimate time/effort
🔹 Small – easy to complete in one iteration
🔹 Testable – has acceptance criteria that can be verified