# Tri-State Traffic Accident Dataset Project
Version: 1.0

## OVERVIEW
This project compiles and standardizes traffic accident data from Pennsylvania, New York, and Delaware. The final dataset provides a unified format for analyzing traffic incidents across state lines, including key details such as time, location, weather, and severity classifications.

Our analysis and visualizations are available on Kaggle:
https://www.kaggle.com/code/maddraf/tri-state-accident-data-analysis-pa-ny-de

### Setup Instructions
Install all necessary dependencies
```
$> pip install pandas matplotlib seaborn
```

Run the notebook
```
$> jupyter notebook <THIS_NOTEBOOK_FILE>
```

### Potential uses for this dataset include:

Government agencies: Infrastructure planning and safety policy formulation.
Researchers: Traffic safety studies and pattern identification.
Emergency response planners: Resource allocation optimization.
Insurance companies: Risk assessment and claims analysis.

## DATA SOURCES
Data is sourced from:

Pennsylvania: Public crash data archives (pennshare.maps.arcgis.com)
New York: Queryable API from data.ny.gov
Delaware: Queryable API from data.delaware.gov
PA data is available as .zip archives; NY and DE data can be fetched via public APIs.

## DATA DICTIONARY
The combined dataset includes the following fields:

year (int): Year of the accident.
month (int): Month of the accident.
day_of_week (str): Day of the week (e.g., Monday).
time (HH:MM:SS): Time of day the accident occurred.
county (str): County where the accident took place.
state (str): State abbreviation (PA, NY, DE).
collision_type (str): Type of collision (e.g., Rear-End, Head-On, Angle).
crash_class (str): Severity classification (Property Damage Accident, Injury Accident, Fatal Accident).
fatal (bool): Whether the crash involved a fatality.
pedestrian_involved (bool): Whether a pedestrian was involved.
multi_vehicle (bool): Whether multiple vehicles were involved.
lighting_conditions (str): Conditions at the time of the accident (e.g., Daylight, Dusk, Dark).
road_conditions (str): Surface conditions of the road (e.g., Dry, Wet, Snow/Ice).
weather_conditions (str): Weather at the time (e.g., Rain, Cloudy, Fog/Smog/Smoke).

## RECONSTRUCTION & CODE
All code and documentation needed to:

Retrieve raw state datasets (via APIs or archives)
Clean, standardize, and merge the data
Generate the final combined dataset
These are maintained in accompanying  Jupyter notebooks within this project’s repository. Please see the repository’s code files for instructions and detailed steps on data reconstruction.

## DATA ACCESS & DISTRIBUTION
The final dataset (combined_dataset.csv) and subsets by state (PA.csv, NY.csv, DE.csv) are provided in designated folders. A sample dataset (sample.csv) is also available for quick exploration. Users may load these files into Python, or other tools for analysis.

## SUGGESTED ANALYSES & VISUALIZATIONS
Potential analyses include:

Crash frequency by day of week or hour of the day.
Severity comparisons across states.
Effects of weather and lighting on crash rates.
Identification of high-risk counties for targeted policy interventions.
Visualizations like bar charts, heatmaps, and time-series plots are encouraged.

## CONTACT & CONTRIBUTIONS
Team Members:

Ian Speers (is482@drexel.edu)
Mary Sullivan (mes529@drexel.edu)
Jinsu Mathew (jm5332@drexel.edu)
Rafi Ahmad (ria38@drexel.edu)

We welcome suggestions, feedback, and contributions. Please reach out via email or submit issues/pull requests on the project’s repository.

## ACKNOWLEDGMENTS
Data provided by the Departments of Transportation for Pennsylvania, New York, and Delaware. Users are encouraged to review and comply with any licensing or attribution requirements stated by these agencies.
