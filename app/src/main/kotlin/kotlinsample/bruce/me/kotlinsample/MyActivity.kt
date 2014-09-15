package kotlinsample.bruce.me.kotlinsample

import android.support.v7.app.ActionBarActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinsample.bruce.me.kotlinsample.model.*;

public class MyActivity : ActionBarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my)
        val list = listOf("a", "b", "c", "d")
        list.map { x -> println("------------$x") }
        val numbers = 1..10
        numbers.filter { it > 5 }.map { println(it) }
        val dict = mapOf( "name" to "bruce", "gender" to "male", "compant" to "ytx" )
        for ((k, v) in dict) {
            println("key: $k  val: $v")
        }

        val user = User("bruce", 26, "ytx", "male")
        println(user)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item?.getItemId()
        if (id == R.id.action_settings) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}
