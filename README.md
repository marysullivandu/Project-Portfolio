# Mary Sullivan \| Data Science Project Portfolio

I am a data professional with a background in mathematics and data
science and an interest in using data to answer complex questions,
identify meaningful patterns, and support better decision-making.

This portfolio highlights selected projects involving predictive
modeling, statistical analysis, feature engineering, data acquisition,
data preprocessing, visualization, and software development.

> **A Note on Professional Experience**\
> The projects shown here represent work that I am able to share
> publicly. Much of my professional experience involves proprietary
> data, internal tools, and confidential business processes and
> therefore cannot be included in this portfolio. Please see my resume
> for a broader overview of my professional data experience.

------------------------------------------------------------------------

# Predicting Employee Turnover

**Predictive Modeling \| Classification \| Business Analytics**

## The Question

Can employee information be used to predict which employees are at risk
of leaving an organization, and what factors are most associated with
employee attrition?

Employee turnover can be costly for organizations due to recruiting,
onboarding, training, and lost productivity. This project approached
employee attrition as both a predictive modeling problem and a business
decision-making problem.

## The Data

The analysis used an employee-level dataset originally developed by IBM
data scientists and made available through Kaggle. Each observation
represents an individual employee and includes information related to
demographics, job characteristics, satisfaction, commute distance,
department, and other employment factors.

## Approach

I began by exploring the dataset to understand patterns associated with
employee attrition, including differences across job roles and
relationships among numerical variables.

I then developed and evaluated two classification approaches:

-   Logistic Regression
-   Random Forest

Rather than evaluating the models using accuracy alone, I considered
multiple classification metrics, including precision, recall, F1 score,
and ROC-AUC.

## Results

### Logistic Regression

-   **Accuracy:** 86.1%
-   **Precision:** 61.5%
-   **Recall:** 34.0%
-   **F1 Score:** 43.8%
-   **ROC-AUC:** 0.811

### Random Forest

-   **Accuracy:** 84.7%
-   **Precision:** 60.0%
-   **Recall:** 12.8%
-   **F1 Score:** 21.1%
-   **ROC-AUC:** 0.806

Based on ROC-AUC, Logistic Regression produced the stronger overall
model.

## Business Application

A model like this could help an organization identify employees with
elevated attrition risk and investigate the factors contributing to that
risk.

Rather than simply producing a prediction, feature importance and model
interpretation can help HR teams identify areas where retention
initiatives may have the greatest impact.

## Future Work

-   Test additional classification algorithms
-   Improve identification of minority-class attrition cases
-   Perform additional feature engineering
-   Distinguish voluntary resignations from terminations
-   Explore intervention strategies based on identified risk factors

**Skills Demonstrated:** Predictive Modeling • Logistic Regression •
Random Forest • Classification • Model Evaluation • Exploratory Data
Analysis • Data Visualization • Business Analysis

------------------------------------------------------------------------

# Predicting NFL Offensive Playcalling

**Machine Learning \| Feature Engineering \| Multiclass Classification**

## The Question

Can game context and a team's historical offensive tendencies be used to
predict what type of offensive play an NFL team will attempt next?

NFL playcalling is a dynamic decision-making problem influenced by
factors including down, field position, score, time remaining, and a
team's offensive strategy. This project used machine learning to
investigate whether those conditions contain enough information to
anticipate an upcoming play.

## The Data

The project used NFL regular-season game and play data from 2017--2025.

Raw play descriptions were transformed into structured target categories
representing offensive play attempts. Plays were classified into
categories such as:

-   Run
-   Short pass
-   Long pass
-   Punt
-   Field goal attempt

Plays that could not reliably represent the intended offensive call,
such as sacks and other abnormal situations, were removed.

## Feature Engineering

A significant portion of the project involved converting raw game
information and text into meaningful predictive features.

Features included:

-   **Down** --- current down number
-   **Yards to First Down** --- distance required for a new set of downs
-   **Yards to End Zone** --- field position relative to the end zone
-   **Score Difference** --- difference between the offensive and
    defensive teams' scores
-   **Minutes Remaining** --- game time remaining
-   **Team Run Tendency**
-   **Team Short-Pass Tendency**
-   **Team Long-Pass Tendency**

Special attention was given to preventing data leakage. Team tendencies
for a particular game were calculated using only information that would
have been available before that game occurred.

## Modeling

The problem was treated as a multiclass classification task.

Three approaches were evaluated:

-   Logistic Regression
-   Random Forest
-   Gradient Boosting

Because the target classes were imbalanced, the dataset was stratified
and F1 score was emphasized during model evaluation rather than relying
solely on accuracy.

Random Forest and Gradient Boosting models were also tuned through grid
search.

## Results

  Model                            F1 Score    Accuracy
  ----------------------------- ----------- -----------
  Logistic Regression                 0.492       62.8%
  Random Forest --- Tuned             0.531       67.2%
  Gradient Boosting --- Tuned     **0.553**   **67.5%**

Gradient Boosting produced the strongest overall performance.

## Application

A play-prediction system could potentially support:

-   In-game decision-making
-   Sports analytics
-   Broadcast analysis
-   Opponent scouting
-   Identification of team playcalling tendencies

Beyond sports, the project demonstrates a broader data-science problem:
using historical behavior and current conditions to predict an
individual's or organization's next decision.

## Future Work

Potential improvements include incorporating:

-   Weather
-   Defensive rankings
-   Quarterback tendencies
-   Offensive formations
-   Defensive formations
-   Additional historical context
-   More advanced modeling techniques

**Skills Demonstrated:** Machine Learning • Feature Engineering •
Gradient Boosting • Random Forest • Logistic Regression • Multiclass
Classification • Hyperparameter Tuning • Grid Search • Imbalanced Data •
Data Leakage Prevention • Data Visualization

------------------------------------------------------------------------

# Tri-State Traffic Accident Data Acquisition & Preprocessing

**Data Acquisition \| APIs \| Data Cleaning \| Data Standardization**

## The Challenge

Public data is often available without being immediately usable.

Pennsylvania, New York, and Delaware each publish traffic accident
information, but differences in file formats, terminology, categorical
values, schemas, and reporting practices make direct cross-state
analysis difficult.

The goal of this project was to build a standardized dataset that could
support regional traffic-safety research across all three states.

## Data Acquisition

Data was collected from official public sources using different
acquisition methods:

-   **Pennsylvania** --- ZIP archives from PennDOT
-   **New York** --- public Socrata API
-   **Delaware** --- public Socrata API

API responses were cached locally to improve performance during repeated
processing.

## Data Preprocessing

Each state's dataset required an independent cleaning process before the
datasets could be combined.

Preprocessing included:

-   Understanding and comparing the three source schemas
-   Decoding integer-based categorical fields
-   Cleaning date and time fields
-   Renaming columns
-   Standardizing data types
-   Creating common state identifiers
-   Selecting fields shared across datasets
-   Deriving boolean indicators for fatalities, pedestrian involvement,
    and multi-vehicle crashes
-   Mapping different categorical terminology into standardized values

A major challenge was determining how conceptually similar fields should
be represented when each state used different terminology or coding
systems.

## Final Dataset

The standardized dataset includes variables describing:

-   Date and time
-   County and state
-   Collision type
-   Crash severity
-   Fatal crashes
-   Pedestrian involvement
-   Multi-vehicle involvement
-   Lighting conditions
-   Road conditions
-   Weather conditions

The resulting structure allows accident records from all three states to
be analyzed consistently.

## Potential Applications

-   **Public Safety** --- identifying high-risk locations and accident
    patterns
-   **Research** --- studying relationships among road conditions,
    weather, infrastructure, and crashes
-   **Transportation Planning** --- informing infrastructure
    improvements and resource allocation
-   **Insurance** --- supporting geographic risk analysis and
    accident-pattern research

## Challenges & Limitations

The project required addressing several real-world data-quality
problems.

States differed substantially in how they recorded similar information.
Some source datasets contained missing information, and New York lacked
some geographic information available from other states.

Large source files also introduced memory and processing challenges
during cleaning and integration.

These limitations reinforced an important lesson: producing a reliable
analytical dataset requires understanding not only how to manipulate
data, but also how the original data was collected and what its
limitations mean for downstream analysis.

## Outcome

The project produced a unified traffic-accident dataset for
Pennsylvania, New York, and Delaware that can be used for cross-state
traffic-safety research.

The final dataset and supporting analysis were distributed publicly
through Kaggle to make the data accessible for additional research and
analysis.

**Skills Demonstrated:** Python • Pandas • API Data Acquisition • Data
Cleaning • Data Integration • Data Standardization • Data Quality •
Feature Creation • Large Dataset Processing • Data Visualization

------------------------------------------------------------------------

# Personal Finance Tracker

**Java \| Object-Oriented Programming \| Software Design**

## The Project

I developed a Java-based personal finance application designed to help
users record income and expenses, monitor their overall balance,
understand spending by category, and generate a recommended budget.

While my primary focus is data science, this project demonstrates my
understanding of software-development principles and object-oriented
programming.

## Application Design

The application was structured around a base `Transaction` class with
specialized `Income` and `Expense` classes.

A `FinanceTracker` class manages collections of transactions and
provides the application's primary functionality.

The program allows a user to:

-   Add income and identify its source
-   Add expenses and assign categories
-   View recorded transactions
-   Calculate total account balance
-   Generate a recommended budget based on annual salary
-   View spending totals by expense category

## Object-Oriented Design

The application uses inheritance to represent different types of
financial transactions.

`Transaction` serves as the parent class, while `Income` and `Expense`
extend it with information specific to each transaction type.

The `FinanceTracker` maintains collections of transaction objects and
budget categories, demonstrating composition alongside inheritance.

## User Interaction & Error Handling

A command-line interface allows users to interact with the application
through a menu.

Input validation and exception handling prevent invalid numerical input
from terminating the program and prompt users to provide valid values
when necessary.

## Testing

Separate testing classes were created to validate important components,
including:

-   Transaction creation
-   Income creation
-   Expense creation
-   Getters and setters
-   Transaction management
-   Balance calculation
-   Budget generation
-   Expense breakdown functionality

**Skills Demonstrated:** Java • Object-Oriented Programming •
Inheritance • Composition • Collections • HashMaps • ArrayLists •
Exception Handling • Application Design • Testing
