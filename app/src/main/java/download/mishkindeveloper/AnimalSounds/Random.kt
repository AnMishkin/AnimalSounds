//package download.mishkindeveloper.AnimalSounds;
//
//import android.app.Activity
//import android.content.Intent
//import android.util.Log
//import androidx.appcompat.widget.ActivityChooserView
//import androidx.core.app.ActivityCompat
//import androidx.core.content.ContextCompat.startActivity
//import java.util.*
//import kotlin.collections.ArrayList
//
//
//
//    fun ran() {
//        val activityList: java.util.ArrayList<Class<*>> = java.util.ArrayList()
//        activityList.add(Cat::class.java)
//        activityList.add(Chiken::class.java)
//        activityList.add(Mouse::class.java)
////        activityList.add(ActivityFour::class.java)
////        activityList.add(ActivityFive::class.java)
//
//        val generator = Random()
//        val number = generator.nextInt(3) + 1
//
//        var activity: Class<*>? = null
//        Log.d("Mylog","запускается активити $activity")
//        // Here, we are checking to see what the output of the random was
//        when (number) {
//            1 -> {
//                activity = Cat::class.java
//                // We are adding the number of the activity to the list
//                activityList.remove(Cat::class.java)
//            }
//            2 -> {
//                activity = Chiken::class.java
//                activityList.remove(Chiken::class.java)
//            }
//            3 -> {
//                activity = Mouse::class.java
//                activityList.remove(Mouse::class.java)
//            }
////            4 -> {
////                activity = ActivityFour::class.java
////                activityList.remove(ActivityFour::class.java)
////            }
//            else -> {
//                activity = MainActivity::class.java
//                activityList.remove(MainActivity::class.java)
//            }
//        }
//        val intent = Intent(ActivityChooserView,activity).apply { putExtra("ACTIVITY_LIST", activityList) }
//        startActivity(intent)
//        Log.d("Mylog","запускается активити $activityList")
//        finish()
////        val myRandomChallenges = Random.nextInt(1..3)
////
////        when (myRandomChallenges) {
////            1 -> {var intent = Intent(this,lamb::class.java)
////                startActivity(intent)}
////            2 -> startActivity(Intent(this, lev::class.java))
////            3 -> startActivity(Intent(this, lemur::class.java))
////
////        }
//
//
////        val activityList: ArrayList<Class<*>> = ArrayList()
////        activityList.add(Cat::class.java)
////        activityList.add(Chiken::class.java)
////        activityList.add(Mouse::class.java)
//////        activityList.add(ActivityFour::class.java)
//////        activityList.add(ActivityFive::class.java)
////
////        val generator = Random()
////        val number = generator.nextInt(5) + 1
////
////        var activity: Class<*>? = null
////
////        // Here, we are checking to see what the output of the random was
////        when (number) {
////            1 -> {
////                activity = Cat::class.java
////                // We are adding the number of the activity to the list
////                activityList.remove(Cat::class.java)
////            }
////            2 -> {
////                activity = Chiken::class.java
////                activityList.remove(Chiken::class.java)
////            }
////            3 -> {
////                activity = Mouse::class.java
////                activityList.remove(Mouse::class.java)
////            }
//////            4 -> {
//////                activity = ActivityFour::class.java
//////                activityList.remove(ActivityFour::class.java)
//////            }
////            else -> {
////                activity = MainActivity::class.java
////                activityList.remove(MainActivity::class.java)
////            }
////        }
////        // We use intents to start activities
////        // We use intents to start activities
////        val intent = Intent(getBaseContext(), activity)
////        // `intent.putExtra(...)` is used to pass on extra information to the next activity
////        // `intent.putExtra(...)` is used to pass on extra information to the next activity
////        intent.putExtra("ACTIVITY_LIST", activityList)
////        startActivity(intent)
//    }
//
//
////
////
////class RandomLayoutActivity : AppCompatActivity() {
////
////        companion object {
////
////      private  fun createIntent(context: Context) =
////        Intent(context,RandomLayoutActivity::class.java)
////
////                private val layouts by lazy {
////                        setOf(
////                                R.layout.activity_bee,
////                                        R.layout.activity_cat,
////                                R.layout.activity_frog
////
////                        )
////                }
////
////        }
////
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////        setContentView(R.layout.activity_random_l)
////    }
////
////
////
////
////
////}
