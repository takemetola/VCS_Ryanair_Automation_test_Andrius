# Test Cases for [Ryanair.com](https://www.ryanair.com/gb/en)

## Test Case 1 - New Account Set Up
**Description**: Verify that the user login functionality works correctly.

**Steps**:
1. Click on Log In button on the Ryanair homepage.
2. Enter valid email. Input: 'jurkusand@gmail.com'
3. Enter valid password. Input: 'Tomukas123'
4. Click on 'Log in'.

**Expected Result**: The user should be successfully logged in and redirected to homepage with User profile logged in. (jurkusand@gmail.com)

---

## Test Case 2 - Update Account Date of Birth
**Description**: Change date of birth of the user.

**Steps**:
1. Click On Profile email on the Ryanair homepage.
2. Select myRyanair.
3. Click on Edit in Date of Birth section.
4. Enter date of birth. Input: '20/04/2000'
5. Click on Save button.

**Expected Result**: Date of birth section is successfully changed and showing ** / ** / 2000 as a result.

---

## Test Case 3 - Flight Search Functionality
**Description**: Select a one way flight from Vilnius to Berlin Brandenburg.

**Steps**:
1. Open Ryanair homepage.
2. Select One way ticket.
3. Select Vilnius as departure airport.
4. Select Germany as arrival destination.
5. Select Berlin Brandenburg airport.
6. Select departure date. Input: '31/01/2024'
7. Select 1 Adult Passenger.
8. Click on search.
9. Read Flight Number. (FR 6637)

**Expected Result**: Selected flight destination and flight number are correct. (FR 6637 Vilnius to Berlin Brandenburg)

---

## Test Case 4 - Get Hotel List Functionality
**Description**: Select city, date to receive a list of available hotels in the area.

**Steps**:
1. Open Ryanair homepage.
2. Select Hotels section.
3. Select Check-in date. Input: '27/02/2024'
4. Select Check-out date. Input: '28/02/2024'
5. Add city name in the Destination box and select from the list. (Berlin, Germany)
6. Click on search button.

**Expected Result**: Get a list of available hotels in the area during selected dates.

---

## Test Case 5 - Verify Chat bot functionality
**Description**: Verify function of Chat bot by providing name and email and connecting to Chat window.

**Steps**:
1. Open the website.
2. Click on the "Let's Chat" menu.
3. Click on the "Chat Now" button.
4. Enter the name. Input: 'Tom Tom'
5. Enter the email. Input: 'test01@gmail.com'
6. Click on the "Start Chat" button.

**Expected Result**: The Chat bot is functional and ready to receive input message.
