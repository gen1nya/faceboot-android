package com.example.evgeniy.facebot_client_android

import android.app.Activity
import android.app.Fragment

/**
 * @author evgeniy
 * @since 07.04.18.
 */
/**
 * Расширение для перехода на новый фрагмент
 *
 * Принимает:
 * [fragment] - новый фрагмент
 * [placeHolder] - ID framelayout'а в который будет загружен фрагмент
 * [animate] - использовать анимацию да/нет
 * [backStack] - добавить фрагмент в стек да/нет
 *
 * Возвращает: ничего
 *
 * */

fun Fragment.navigateToFragment(
    fragment: Fragment,
    placeHolder: Int = R.id.fragmentPlaceholder,
    animate: Boolean = true,
    backStack: Boolean = true) {
    val fragmentTransaction = this.fragmentManager.beginTransaction()
    val tag = fragment::class.java.simpleName
    if (animate) {
/*        fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_in_right,
                R.anim.slide_out_left, R.anim.slide_out_right)*/
    }
    if (backStack) {
        fragmentTransaction.addToBackStack(tag)
    }
    fragmentTransaction.add(placeHolder, fragment, tag)
    fragmentTransaction.commit()
}

fun Activity.navigateToFragment(
    fragment: Fragment,
    placeHolder: Int = R.id.fragmentPlaceholder,
    animate: Boolean = true,
    backStack: Boolean = true) {
    val fragmentTransaction = this.fragmentManager.beginTransaction()
    val tag = fragment::class.java.simpleName
    if (animate) {
/*        fragmentTransaction.setCustomAnimations(R.anim.slide_in_left, R.anim.slide_in_right,
                R.anim.slide_out_left, R.anim.slide_out_right)*/
    }
    if (backStack) {
        fragmentTransaction.addToBackStack(tag)
    }
    fragmentTransaction.add(placeHolder, fragment, tag)
    fragmentTransaction.commit()
}