//для каждого

package download.mishkindeveloper.AnimalSounds
import android.app.Activity
import android.content.Context
import download.mishkindeveloper.AnimalSounds.ChikenActivity
import download.mishkindeveloper.AnimalSounds.MouseActivity
import download.mishkindeveloper.AnimalSounds.CatActivity
import download.mishkindeveloper.AnimalSounds.MainActivity
import android.content.Intent
import android.media.MediaPlayer
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.google.android.gms.ads.interstitial.InterstitialAd
import download.mishkindeveloper.AnimalSounds.databinding.*

import java.util.*


class learn : AppCompatActivity() {
    //закинуть в другие лайаяуты!!!!!!!!!!!!!!!!!!!!!!



    lateinit var binding: ActivityLearnBinding
    private var interAd: InterstitialAd? = null

    //воспроизведение звука животного
    val mediaPlayer by lazy { MediaPlayer.create(this, R.raw.toukan) }

    override fun onCreate(savedInstanceState: Bundle?) {

        var music = false

        super.onCreate(savedInstanceState)
        binding = ActivityLearnBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getWindow().setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        );
        getSupportActionBar()?.hide();

//переход сразу к приложению
        binding.iKnow.setOnClickListener {
//            var intent = Intent(this,randomList()::class.java)
//           // Log.d("Mylog","${getPrediction()}")
//            startActivity(intent)
//createIntent()
//rand()
//onClickRandom()
//            //ведет на рандом активити
//            var intent = Intent(this,Random_l::class.java)
//            startActivity(intent)
//              finish()

////полуработабющая
//            val c = listOf(
//                bee::class.java,
//                //monkey::class.java,
//                //squirrel::class.java,
//                chiken::class.java,
//                lev::class.java
//            )
//            val a=c.random()
//            startActivity(Intent(this,a))
//            //c.minus(a)
//            Log.d("Mylog","СТОП ТУТ-$a")
////полуработабющая
//            var intent = Intent(this,Random_l::class.java)
//            startActivity(intent)

            //работает но хз
            //runRandom()


/////////работает
//            val generator = Random()
//            val number: Int = generator.nextInt(3) + 1
//            // The '5' is the number of activities
//
//            // The '5' is the number of activities
//            var activity: Class<*>? = null
//
//            // Here, we are checking to see what the output of the random was
//            activity = when (number) {
//                1 -> Cat::class.java
//                2 -> Chiken::class.java
//                3 -> Mouse::class.java
////                4 -> ActivityFour::class.java
//                else -> MainActivity::class.java
//            }
//            Log.d("Mylog","запускается активити $activity")

//            // We use intents to start activities
//            // We use intents to start activities
//            val intent = Intent(baseContext, activity)
//            startActivity(intent)
////конец работает


//////////////////////////////////работает четко
//            val activityList: ArrayList<String> = ArrayList()
//            val mainActivity = "MainActivity::class.java"
//
//            val cat = "1Cat"
//            val chiken = "2Chiken"
//            val mouse = "3Mouse"
//            val bee = "download.mishkindeveloper.AnimalSounds.bee::class.java"
//            val elefant = "this,download.mishkindeveloper.AnimalSounds.elefant::class.java"
//            val frog = "this,download.mishkindeveloper.AnimalSounds.frog::class.java"
//            val furseal = "7furseal"
//            val grasshopper = "8grasshopper"
//            val lamb = "9lamb"
//            val lev = "10lev"
//            val monkey = "11monkey"
//            val peacock = "12peacock"
//            val pig = "13pig"
//            val rooster = "14rooster"
//            val snake = "15snake"
//            val squirrel = "16squirrel"
//            val teddy = "17teddy"
//            val zebra = "18zebra"
//            val owl = "19owl"
//            val lemur = "20lemur"
//
////            activityList.add(cat)
////            activityList.add(chiken)
////            activityList.add(mouse)
//            activityList.add(bee)
//            activityList.add(elefant)
//            activityList.add(frog)
////            activityList.add(furseal)
////            activityList.add(grasshopper)
////            activityList.add(lamb)
////            activityList.add(lev)
////            activityList.add(monkey)
////            activityList.add(peacock)
////            activityList.add(pig)
////            activityList.add(rooster)
////            activityList.add(snake)
////            activityList.add(squirrel)
////            activityList.add(teddy)
////            activityList.add(zebra)
////            activityList.add(owl)
////            activityList.add(lemur)
//
//
//
//            val generator = Random()
//            //колличество активити(животных)
//            var inNumber = 4
//            val number = generator.nextInt(inNumber) + 1
//           lateinit var activity: String
//            Log.d("Mylog","массив $activityList")
//            when (number) {
////                1 -> {
////                    intent = Intent(this,CatActivity::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(cat)
////                    inNumber -= 1
////                    Log.d("Mylog","активити лист ${activityList}")
////                    Log.d("Mylog","интент $intent")
////                    Log.d("Mylog","интент $inNumber")
////                    startActivity(intent)
////                    finish()
////               }
////                2 -> {
////                    intent = Intent(this,ChikenActivity::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(chiken)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                3 -> {
////                    intent = Intent(this,MouseActivity::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(mouse)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
//                1 -> {
//                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.bee::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
//                    activityList.remove(bee)
//                    Log.d("Mylog","активити лист $activityList")
//                    Log.d("Mylog","интент $intent")
//                    startActivity(intent)
//                    finish()
//                }
//                2 -> {
//                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.elefant::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
//                    activityList.remove(elefant)
//                    Log.d("Mylog","активити лист $activityList")
//                    Log.d("Mylog","интент $intent")
//                    startActivity(intent)
//                    finish()
//                }
//               3 -> {
//                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.frog::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
//                    activityList.remove(frog)
//                    Log.d("Mylog","активити лист $activityList")
//                    Log.d("Mylog","интент $intent")
//                    startActivity(intent)
//                    finish()
//                }
////                7 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.furseal::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(furseal)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                8 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.grasshopper::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(grasshopper)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                9 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.lamb::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(lamb)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                10 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.lev::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(lev)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                11 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.monkey::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(monkey)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                12 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.peacock::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(peacock)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                13 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.pig::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(pig)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                14 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.rooster::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(rooster)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                15 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.snake::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(snake)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                16 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.squirrel::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(squirrel)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                17 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.teddy::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(teddy)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                18 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.zebra::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(zebra)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                19 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.owl::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(owl)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
////                20 -> {
////                    intent = Intent(this,download.mishkindeveloper.AnimalSounds.lemur::class.java).apply { putExtra("ACTIVITY_LIST", activityList) }
////                    activityList.remove(lemur)
////                    Log.d("Mylog","активити лист $activityList")
////                    Log.d("Mylog","интент $intent")
////                    startActivity(intent)
////                    finish()
////                }
//                else -> {
//                    intent = Intent(this,MainActivity::class.java)//.apply { putExtra("ACTIVITY_LIST", activityList) }
//                    activityList.remove(mainActivity)
//                    Log.d("Mylog","активити лист $activityList")
//                    Log.d("Mylog","интент $intent")
//                    startActivity(intent)
//                    finish()
//                }
//
//           }
            startActivity(Intent(this,IntroActivity::class.java))
            //IntroActivity().intent.extractActivities().startRandom(context = this)
            finish()
        }
        //политика конфиденциальности
        binding.policy.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://mishkindeveloper.download/pages-Privacy-Policy.html"))
            startActivity(browserIntent)
        }
        //название животного
        binding.startLearn.setOnClickListener {
            binding.iKnow.isVisible = false
            binding.textView.isVisible = true
            binding.infoName.setText(R.string.name_animal)
            binding.startLearn.setText(R.string.next)

            //картинка
            binding.startLearn.setOnClickListener {
                binding.textView.isVisible = false
                binding.imageAnimal.isVisible = true
                binding.infoName.isVisible = false
                binding.infoName2.setText(R.string.next2)
                binding.infoName2.textSize = 20F

                //кнопка назад
                binding.startLearn.setOnClickListener {
                    binding.imageAnimal.isVisible = false
                    binding.imageBack.isVisible = true
                    binding.infoName2.isVisible = false
                    binding.infoName3.setText(R.string.next3)

                    //кнопка вперед
                    binding.startLearn.setOnClickListener {
                        binding.imageAnimal.isVisible = false
                        binding.imageBack.isVisible = false
                        binding.imageNext.isVisible = true
                        binding.infoName2.isVisible = false
                        binding.infoName3.setText(R.string.next4)

                        //кнопка звука
                        binding.startLearn.setOnClickListener {
                            binding.imageNext.isVisible = false
                            binding.infoName2.isVisible = false
                            binding.imageZvyk.isVisible = true
                            binding.infoName3.setText(R.string.next5)
                            binding.infoName3.textSize = 25F
                            binding.startLearn.setText(R.string.go)

                            //вход в программу
                            binding.startLearn.setOnClickListener {
                              var intent = Intent(this,lev::class.java)
                                Log.d("Mylog","это интент $intent")
                               startActivity(intent)
                                finish()
                            }
                        }
                    }


                }
            }
        }
            //замена мультяшного животного на обычного и назад
            fun onClickAnimal() {
                binding.imageAnimal.setOnClickListener(View.OnClickListener {
                    binding.imageAnimal.setImageResource(R.mipmap.toucans)
                    binding.imageAnimal.setOnClickListener {
                        binding.imageAnimal.setImageResource(R.mipmap.toucan)
                        onClickAnimal()
                    }
                })
            }
            onClickAnimal()

            //проигрываем и останавливаем музыку
            fun playMusic() {
                binding.imageZvyk.setOnClickListener {
                    if (music) {
                        mediaPlayer.stop()
                        mediaPlayer.prepare()
                    } else {
                        mediaPlayer.start()
                    }
                    music = !music
                }
            }
            playMusic()

//следующая картинка
            binding.imageNext.setOnClickListener {
                //  nextImage()
                // finish()
                mediaPlayer.stop()
            }
            //преведущая картинка
            binding.imageBack.setOnClickListener {
                //  var intent = Intent(this,lev::class.java)
                //  startActivity(intent)
                //   finish()
                mediaPlayer.stop()
            }
        }
        //начиная от сюда поставить во все лайяуты!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        override fun onPause() {
            super.onPause()
            mediaPlayer.stop()
        }
        override fun onResume() {
            super.onResume()
        }

        override fun onDestroy() {
            super.onDestroy()
        }
}


































