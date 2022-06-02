package com.example.mathpuzzlegame

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {
    lateinit var v1:TextView
    lateinit var v2:TextView
    lateinit var v3:TextView
    lateinit var v4:TextView
    lateinit var v5:TextView
    lateinit var v6:TextView
    lateinit var v7:TextView
    lateinit var v8:TextView
    lateinit var v9:TextView
    lateinit var v10:TextView
    lateinit var v11:TextView
    lateinit var v12:TextView
    lateinit var v13:TextView
    lateinit var v14:TextView
    lateinit var v15:TextView
    lateinit var op1:TextView
    lateinit var op2:TextView
    lateinit var op3:TextView
    lateinit var op4:TextView
    lateinit var op5:TextView
    lateinit var op6:TextView
    lateinit var op7:TextView
    lateinit var op8:TextView
    lateinit var op9:TextView
    lateinit var op10:TextView
    lateinit var sub: Button
    lateinit var l:TextView
    var bv1 = 0
    var bv2 = 0
    var bv3 = 0
    var bv4 = 0
    var bv5 = 0
    var bv6 = 0
    var bv7 = 0
    var bv8 = 0
    var bv9 = 0
    var bv10 = 0
    var rv1 = ""
    var rv2 = ""
    var rv3 = ""
    var rv4 = ""
    var rv5 = ""
    var newlist = listOf<Int>()
    var oplist = listOf<TextView>()
    var value=""
    var id = 0
    var lives = 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        v1 = findViewById(R.id.a1)
        v2 = findViewById(R.id.a3)
        v3 = findViewById(R.id.a5)
        v4 = findViewById(R.id.b1)
        v5 = findViewById(R.id.b3)
        v6 = findViewById(R.id.b5)
        v7 = findViewById(R.id.c1)
        v8 = findViewById(R.id.c3)
        v9 = findViewById(R.id.c5)
        v10 = findViewById(R.id.d1)
        v11 = findViewById(R.id.d3)
        v12 = findViewById(R.id.d5)
        v13 = findViewById(R.id.e1)
        v14 = findViewById(R.id.e3)
        v15 = findViewById(R.id.e5)
        op1 = findViewById(R.id.op1)
        op2 = findViewById(R.id.op2)
        op3 = findViewById(R.id.op3)
        op4 = findViewById(R.id.op4)
        op5 = findViewById(R.id.op5)
        op6 = findViewById(R.id.op6)
        op7 = findViewById(R.id.op7)
        op8 = findViewById(R.id.op8)
        op9 = findViewById(R.id.op9)
        op10 = findViewById(R.id.op10)
        sub = findViewById(R.id.submitbtn)
        l = findViewById(R.id.lives)
        bv1 = (1..500).random()
        bv2 = (1..500).random()
        bv3 = (1..500).random()
        bv4 = (1..200).random()
        bv5 = (1..99).random()
        bv6 = (1..99).random()
        bv7 = (1..500).random()
        bv8 = (1..50).random()
        bv9 = (1..500).random()
        bv10 = (1..500).random()
        rv1 = (bv1+bv2).toString()
        rv2 = (bv3-bv4).toString()
        rv3 = (bv5*bv6).toString()
        rv4 = "%.2f".format(bv7.toDouble()/bv8.toDouble())
        rv5 = (bv9+bv10).toString()
        oplist = listOf(op1,op2,op3,op4,op5,op6,op7,op8,op9,op10)
        var list = listOf<Int>(bv1,bv2,bv3,bv4,bv5,bv6,bv7,bv8,bv9,bv10)
        newlist = list.shuffled()
        valuedisplay()
        clicks()
        submit()
    }
    fun valuedisplay(){
        op1.text = newlist[0].toString()
        op2.text = newlist[1].toString()
        op3.text = newlist[2].toString()
        op4.text = newlist[3].toString()
        op5.text = newlist[4].toString()
        op6.text = newlist[5].toString()
        op7.text = newlist[6].toString()
        op8.text = newlist[7].toString()
        op9.text = newlist[8].toString()
        op10.text = newlist[9].toString()
        v3.text = rv1
        v6.text = rv2
        v9.text = rv3
        v12.text = rv4
        v15.text = rv5
    }
    fun clicks(){
        op1.setOnClickListener{
            if(value!=""&&(id!=0)&&(id!=1)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op1.text.toString()){
                value = op1.text.toString()
                op1.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 1
            }
        }
        op2.setOnClickListener{
            if(value!=""&&id!=0&&(id!=2)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op2.text.toString()){
                value = op2.text.toString()
                op2.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 2
            }
        }
        op3.setOnClickListener{
            if(value!=""&&id!=0&&(id!=3)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op3.text.toString()){
                value = op3.text.toString()
                op3.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 3
            }
        }
        op4.setOnClickListener{
            if(value!=""&&id!=0&&(id!=4)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op4.text.toString()){
                value = op4.text.toString()
                op4.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 4
            }
        }
        op5.setOnClickListener{
            if(value!=""&&id!=0&&(id!=5)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op5.text.toString()){
                value = op5.text.toString()
                op5.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 5
            }
        }
        op6.setOnClickListener{
            if(value!=""&&id!=0&&(id!=6)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op6.text.toString()){
                value = op6.text.toString()
                op6.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 6
            }
        }
        op7.setOnClickListener{
            if(value!=""&&id!=0&&(id!=7)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op7.text.toString()){
                value = op7.text.toString()
                op7.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 7
            }
        }
        op8.setOnClickListener{
            if(value!=""&&id!=0&&(id!=8)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op8.text.toString()){
                value = op8.text.toString()
                op8.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 8
            }
        }
        op9.setOnClickListener{
            if(value!=""&&id!=0&&(id!=9)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op9.text.toString()){
                value = op9.text.toString()
                op9.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 9
            }
        }
        op10.setOnClickListener{
            if(value!=""&&id!=0&&(id!=10)){
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
            if(value!=op10.text.toString()){
                value = op10.text.toString()
                op10.setBackgroundColor(ContextCompat.getColor(this,R.color.light_green))
                id = 10
            }
        }
        v1.setOnClickListener{
            if(v1.text.toString()==""&&value!=""){
                v1.text = value
                v1.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v1.text.toString()!=""){
                var n = newlist.indexOf((v1.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v1.text=""
                v1.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
        v2.setOnClickListener{
            if(v2.text.toString()==""&&value!=""){
                v2.text = value
                v2.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v2.text.toString()!=""){
                var n = newlist.indexOf((v2.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v2.text=""
                v2.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
        v4.setOnClickListener{
            if(v4.text.toString()==""&&value!=""){
                v4.text = value
                v4.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v4.text.toString()!=""){
                var n = newlist.indexOf((v4.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v4.text=""
                v4.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
        v5.setOnClickListener{
            if(v5.text.toString()==""&&value!=""){
                v5.text = value
                v5.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v5.text.toString()!=""){
                var n = newlist.indexOf((v5.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v5.text=""
                v5.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
        v7.setOnClickListener{
            if(v7.text.toString()==""&&value!=""){
                v7.text = value
                v7.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v7.text.toString()!=""){
                var n = newlist.indexOf((v7.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v7.text=""
                v7.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
        v8.setOnClickListener{
            if(v8.text.toString()==""&&value!=""){
                v8.text = value
                v8.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v8.text.toString()!=""){
                var n = newlist.indexOf((v8.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v8.text=""
                v8.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
        v10.setOnClickListener{
            if(v10.text.toString()==""&&value!=""){
                v10.text = value
                v10.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v10.text.toString()!=""){
                var n = newlist.indexOf((v10.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v10.text=""
                v10.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
        v11.setOnClickListener{
            if(v11.text.toString()==""&&value!=""){
                v11.text = value
                v11.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v11.text.toString()!=""){
                var n = newlist.indexOf((v11.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v11.text=""
                v11.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
        v13.setOnClickListener{
            if(v13.text.toString()==""&&value!=""){
                v13.text = value
                v13.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v13.text.toString()!=""){
                var n = newlist.indexOf((v13.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v13.text=""
                v13.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
        v14.setOnClickListener{
            if(v14.text.toString()==""&&value!=""){
                v14.text = value
                v14.setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
                value = ""
                oplist[id-1].text=""
                oplist[id-1].setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                id = 0
            }
            else if(v14.text.toString()!=""){
                var n = newlist.indexOf((v14.text.toString()).toInt())
                oplist[n].text = newlist[n].toString()
                v14.text=""
                v14.setBackgroundColor(ContextCompat.getColor(this,R.color.grey))
                oplist[n].setBackgroundColor(ContextCompat.getColor(this,R.color.light_grey))
            }
        }
    }
    fun submit(){
        sub.setOnClickListener{
            if((v1.text.toString()!="")&&(v2.text.toString()!="")&&(v3.text.toString()!="")&&(v4.text.toString()!="")&&(v5.text.toString()!="")
                &&(v6.text.toString()!="")&&(v7.text.toString()!="")&&(v8.text.toString()!="")&&(v9.text.toString()!="")&&(v10.text.toString()!="")) {
                var a = v1.text.toString().toInt() + v2.text.toString().toInt()
                var b = v4.text.toString().toInt() - v5.text.toString().toInt()
                var c = v7.text.toString().toInt() * v8.text.toString().toInt()
                var d = "%.2f".format(v10.text.toString().toDouble() / v11.text.toString().toDouble())
                var e = v13.text.toString().toInt() + v14.text.toString().toInt()
                var f = booltoint((a.toString() == rv1)) + booltoint((b.toString() == rv2)) + booltoint((c.toString() == rv3))+ booltoint((d == rv4)) + booltoint((e.toString() == rv5))
                var s = if(f>0) (f-(3-lives)*0.5) else 0
                if ((a.toString() == rv1) && (b.toString() == rv2) && (c.toString() == rv3) && (d == rv4) && (e.toString() == rv5)) {
                    if(lives==3){
                    Toast.makeText(this, "You won!! Your Score = 5/5", Toast.LENGTH_LONG).show()}
                    else{
                        Toast.makeText(this, "You have completed the puzzle!! Your Score = ${s}/5", Toast.LENGTH_LONG).show()
                    }
                    recreate()
                }
                else{
                    lives-=1
                    if(lives!=0){
                        Toast.makeText(this, "WRONG!! You have ${lives} more lives", Toast.LENGTH_SHORT).show()
                    }
                    if(lives==2){
                        l.text = "LIVES : ❤❤"
                    }
                    if(lives==1){
                        l.text = "LIVES : ❤"
                    }
                    if(lives==0){
                        Toast.makeText(this, "You have lost! Your Score = ${s}/5", Toast.LENGTH_LONG).show()
                        val i = Intent(this,startingpage::class.java)
                        finish()
                        startActivity(i)
                    }
                }
            }
            else{
                Toast.makeText(this,"Please fill all the missing operands",Toast.LENGTH_SHORT).show()
            }
            }
        }
    fun booltoint(b:Boolean):Int{
        if(b){
            return 1
        }
        else{
            return 0
        }
    }
}