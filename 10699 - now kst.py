from datetime import datetime, timedelta

# Get current date and time in UTC
now_utc = datetime.utcnow()

# Convert UTC time to KST (UTC+9)
now_kst = now_utc + timedelta(hours=9)

# Format the date as YYYY-MM-DD
formatted_date = now_kst.strftime('%Y-%m-%d')

# Print the formatted date
print(formatted_date)
