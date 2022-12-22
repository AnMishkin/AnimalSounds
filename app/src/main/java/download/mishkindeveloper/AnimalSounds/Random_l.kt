////package download.mishkindeveloper.AnimalSounds;
////
////import android.content.Context
////import android.content.Intent
////import android.os.Bundle
////import android.util.Log
////import androidx.appcompat.app.AppCompatActivity
////import androidx.core.content.ContextCompat
////import kotlin.collections.ArrayList
////import kotlin.random.Random
////import kotlin.random.nextInt
////
////
////class Random_l : AppCompatActivity() {
////
////
////    private var activity: Class<*>? = null
////
////    override fun onCreate(savedInstanceState: Bundle?) {
////        super.onCreate(savedInstanceState)
////
////        val activityList: ArrayList<String> = ArrayList()
////        activity = intent.getStringExtra("ACTIVITY_LIST")!!
////
////        Log.d("Mylog", "пришло с 1го активити $activityList")
////
////        if (activityList?.size == 0) {
////            var intent = Intent(this, finish::class.java)
////            startActivity(intent)
////        } else {
////            var generator = java.util.Random()
////            val number = generator.nextInt(activityList!!.size) + 1
////
////
////            //lateinit var activity: Class<*>
////
////
////            when (number) {
////                0 -> {
////                   var activity = activityList[0]
////                    activityList?.removeAt(0);
////                }
////                1 -> {
////                  var  activity = activityList[1]
////                    activityList?.removeAt(1);
////                }
////                2 -> {
////                  var  activity = activityList[2]
////                    activityList?.removeAt(2)
////                }
////                3 -> {
////                  var  activity = activityList[3]
////                    activityList?.removeAt(3);
////                }
////            }
////            Log.d("Mylog", "передается дальше по активити $activity")
////            val intent = Intent(baseContext, activity).apply { putExtra("ACTIVITY_LIST", activityList) }
////            startActivity(intent);
////            Log.d("Mylog", "передается дальше по активити $activityList")
////            finish()
////        }
////
////        //startActivity(Intent(this, ran()))
////        //  var a = randomActivityClass()
////        // Log.d("Mylog","активити с индексом-$a")
////
////
////    }
////}
//////
//////    fun ran(){
//////        val myRandomChallenges = Random.nextInt(1..3)
//////
//////        when (myRandomChallenges) {
//////            1 -> startActivity(Intent(this, lamb::class.java))
//////            2 -> startActivity(Intent(this, lev::class.java))
//////            3 -> startActivity(Intent(this, lemur::class.java))
//////
//////        }
//////    }
//////
////////    fun randomActivityClass() =
////////        setOf(
////////            ActivityCatBinding::class.java
////////            bee::class.java,
////////            Cat::class.java,
////////            Chiken::class.java,
////////            Mouse::class.java
////////        ).random()
//////
////////
////////fun ra(){
////////    var people = listOf(
////////        bee::class.java,
////////        Cat::class.java,
////////        Chiken::class.java,
////////        Mouse::class.java)
////////    people.random()
////////
////////}
////////    fun r(){
////////var a = ra()
////////    Log.d("Mylog","активити с индексом-$a")
//////
//////
//////
//////
////////}
//////}
//
//
//
//
//import android.app.Activity
//import android.content.Context
//import android.content.Intent
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import download.mishkindeveloper.AnimalSounds.*
//
//
//class Random_l : ComponentActivity() {
//
//    private val activities = setOf(
//        bee::class.java,
//        CatActivity::class.java,
//        ChikenActivity::class.java,
//        monkey::class.java,
//        elefant::class.java
//    )
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        activities.startRandom(context = this)
//    }
//}
//
//const val EXTRA_ACTIVITY_NAMES = "extra:activityNames"
//
//fun Collection<Class<out Activity>>.startRandom(context: Context) {
//    if (isEmpty()) return
//    val randomActivity = random()
//    val intent = Intent(context, randomActivity)
//    val activityNames = (this - randomActivity).map { it.name }.toTypedArray()
//    intent.putExtra(EXTRA_ACTIVITY_NAMES, activityNames)
//    context.startActivity(intent)
//}
//
//@Suppress("UNCHECKED_CAST")
//fun Intent.extractActivities(): Set<Class<out Activity>> {
//    val activityNames = getStringArrayExtra(EXTRA_ACTIVITY_NAMES)
//    val activities = activityNames?.map {
//        Class.forName(it) as Class<out Activity>
//    }?.toSet()
//    return requireNotNull(activities)
//}