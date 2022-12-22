//Button myButton = (Button) findViewById(R.id.ANOTHER_BUTTON);
//myButton.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        ArrayList<Class> activityList = new ArrayList<>();
//        Bundle extras = getBaseContext().getIntent().getExtras();
//        activityList = extras.get("ACTIVITY_LIST");
//
//        if(activityList.size() == 0) {
//            // Do something when after all activities have been opened
//            doSomeAction();
//        } else {
//            // Now, the random number is generated between 1 and however many
//            // activities we have remaining
//            Random generator = new Random();
//            int number = generator.nextInt(activityList.size()) + 1;
//
//            Class activity = null;
//
//            // Here, we are checking to see what the output of the random was
//            switch(number) {
//                case 1:
//                // We will open the first remaining activity of the list
//                activity = activityList.get(0);
//                // We will now remove that activity from the list
//                activityList.remove(0);
//                break;
//                case 2:
//                // We will open the second remaining activity of the list
//                activity = activityList.get(1);
//                activityList.remove(1);
//                break;
//                case 3:
//                // We will open the third remaining activity of the list
//                activity = activityList.get(2);
//                activityList.remove(2);
//                break;
//                case 4:
//                // We will open the fourth remaining activity of the list
//                activity = activityList.get(3);
//                activityList.remove(3);
//                break;
//                default:
//                // We will open the fifth remaining activity of the list
//                activity = activityList.get(4);
//                activityList.remove(4);
//                break;
//            }
//
//            // Note: in the above, we might not have 3 remaining activities, for example,
//            // but it doesn't matter because that case wouldn't be called anyway,
//            // as we have already decided that the number would be between 1 and the number of
//            // activities left.
//
//
//            // Starting the activity, and passing on the remaining number of activities
//            // to the next one that is opened
//            Intent intent = new Intent(getBaseContext(), activity);
//            intent.putExtra("ACTIVITY_LIST", activityList);
//            startActivity(intent);
//        }
//    }
//}