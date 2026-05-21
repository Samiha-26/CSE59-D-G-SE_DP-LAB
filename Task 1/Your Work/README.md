# Software Requirements Specification (SRS)

## Preface

This document provides the Software Requirements Specification (SRS) for the **Library Management System (LMS)**. It defines the system’s functionalities, performance criteria, security requirements, and overall system architecture necessary for development.

---

## Version History

* **Version 1.0** – Initial Draft.
* **Version 1.1** – Added non-functional requirements and system models.
* **Version 1.2** – Refined system evolution and glossary.

---

# 1. Introduction

## Purpose

The Library Management System (LMS) is a web-based application designed to automate and simplify library operations such as book management, member registration, borrowing, returning, fine calculation, and reporting. The system improves efficiency, reduces manual workload, and enhances user experience for both librarians and members.

## Document Conventions

This document follows the IEEE SRS standard, using:

* **Must** – Indicates mandatory requirements.
* **Should** – Indicates recommended features.
* **May** – Indicates optional enhancements.

## Intended Audience and Reading Suggestions

* **Project Managers & Developers** – For system implementation guidance.
* **Stakeholders & Business Analysts** – To understand system capabilities.
* **Testers & QA Teams** – To validate compliance with requirements.

## Scope

The system provides:

* Book catalog management
* Member registration and management
* Borrowing and returning books
* Fine management
* Reporting and analytics
* Notifications and alerts
* Role-based access control

## References

* IEEE Standard 830-1998 (Software Requirements Specification)
* Internal Business Requirement Specification (BRS)
* System Modeling Documentation

---

# 2. Overall Description

## Product Perspective

The Library Management System is a standalone web application that may integrate with external systems such as email services, barcode scanners, and online payment gateways for fine collection.

## Product Functions

* **Book Management:** Add, update, delete, and search books.
* **Member Management:** Register and manage library members.
* **Borrow & Return System:** Track issued and returned books.
* **Fine Management:** Automatically calculate overdue fines.
* **Reporting & Analytics:** Generate reports on library activities.
* **Notifications:** Alerts for due dates, overdue books, and announcements.

## User Classes and Characteristics

* **Admin:** Manages the entire system, users, and configurations.
* **Librarian:** Handles book inventory, issuing, and returns.
* **Member/Student:** Searches books, borrows books, and views history.

## Operating Environment

* Web-based application (accessible via Chrome, Firefox, Edge).
* Cloud-hosted infrastructure.
* **Database:** MongoDB / MySQL.

## Design and Implementation Constraints

* Compliance with data protection and security standards.
* Scalability to support multiple libraries and large inventories.

## Assumptions and Dependencies

* Internet access is required for online access and real-time updates.
* Barcode scanners may be integrated for faster book processing.
* Future mobile application integration may be considered.

---

# 3. System Requirements Specification

## Functional Requirements

### User Authentication

* The system must allow users to register, log in, and reset passwords.
* The system must enforce role-based authentication (Admin, Librarian, Member).

---

### Book Management

* Librarians must be able to add, update, delete, and categorize books.
* The system must allow searching books by title, author, ISBN, or category.
* The system must track book availability status.

---

### Member Management

* Librarians must be able to register and manage members.
* Members must be able to view their borrowing history.

---

### Borrow & Return Management

* Librarians must be able to issue and receive books.
* The system must record borrowing and return dates.
* The system must automatically update book availability.
* The system must calculate overdue fines automatically.

---

### Reporting & Analytics

* Admins and librarians must be able to generate reports on:

  * Borrowed books
  * Overdue books
  * Active members
  * Fine collections
* Reports should be exportable in PDF and CSV formats.

---

### Notifications

* The system must send alerts for:

  * Due date reminders
  * Overdue books
  * Membership expiration
  * System announcements

---

### Search and Reservation

* Members should be able to search available books.
* Members may reserve unavailable books.

---

## Non-Functional Requirements

### Performance Requirements

* The system must support 500+ concurrent users.
* Book search results must load within 3 seconds.
* Borrowing and return updates must reflect in real time.

---

### Security Requirements

* The system must implement role-based access control.
* All sensitive user data must be encrypted.
* The system must prevent unauthorized access and SQL injection attacks.

---

### Usability Requirements

* The system should have an intuitive UI/UX.
* The system must support accessibility standards.
* The system should provide responsive design for desktop and mobile browsers.

---

### Reliability and Availability

* The system must ensure 99.9% uptime.
* A backup mechanism must be in place for data recovery.
* The system must maintain transaction consistency during borrowing and returning.

---

### Maintainability and Support

* The system must support modular updates.
* The system must provide proper logging and debugging mechanisms.
* The system should support API integration for future enhancements.

---

### Portability

* The system should be accessible from Windows, Mac, and Linux.
* The system must support cloud deployment.

---

# 4. System Models

> * **CONTEXT DIAGRAM**
>
>   <img src="images/library-context-diagram.png" alt="Library Context Diagram">

> * **ACTIVITY DIAGRAM**
>
>   <img src="images/library-activity-diagram.png" alt="Library Activity Diagram">

> * **USE CASE DIAGRAMS**
>
>   <img src="images/library-usecase-page1.png" alt="Use Case Diagram Page 1">

<img src="images/library-usecase-page2.png" alt="Use Case Diagram Page 2">

> * **SEQUENCE DIAGRAM**
>
>   <img src="images/library-sequence-diagram.png" alt="Sequence Diagram">

> * **ENTITY-RELATIONSHIP DIAGRAM**
>
>   <img src="images/library-er-diagram.png" alt="ER Diagram">

> * **STATE DIAGRAM**
>
>   <img src="images/library-state-diagram.png" alt="State Diagram">

---

# 5. System Evolution

## Assumptions

* AI-based book recommendation may be integrated in the future.
* Future support for mobile platforms.
* Scalability for multi-branch libraries.

## Expected Changes

* Integration with online e-book platforms.
* AI-powered recommendation system.
* Online fine payment integration.
* RFID-based book tracking system.

---

# 6. Appendices

## Hardware Requirements

* Cloud-based infrastructure with scalable servers.
* Barcode scanners and optional RFID devices.

## Database Requirements

* Must include logical data relationships between:

  * Books
  * Members
  * Borrow records
  * Reservations
  * Fine transactions

## Glossary

* **ISBN:** International Standard Book Number.
* **RFID:** Radio Frequency Identification technology used for tracking books.
* **Member:** A registered user authorized to borrow books.
* **Fine:** Penalty charged for overdue books.
