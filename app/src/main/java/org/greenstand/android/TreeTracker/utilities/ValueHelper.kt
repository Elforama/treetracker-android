package org.greenstand.android.TreeTracker.utilities


object ValueHelper {

    const val NAME_SPACE = "org.greenstand.android"

    private const val errorsOffset = 0
    const val CONNECTION_FAILURE_RESOLUTION_REQUEST = errorsOffset + 1

    const val SIGNUP_FRAGMENT = "SIGNUP_FRAGMENT"
    const val LOGIN_FRAGMENT = "LOGIN_FRAGMENT"
    const val MAP_FRAGMENT = "MAP_FRAGMENT"
    const val NEW_TREE_FRAGMENT = "NEW_TREE_FRAGMENT"
    const val TREE_HEIGHT_FRAGMENT = "TREE_HEIGHT_FRAGMENT"
    const val FORGOT_PASSWORD_FRAGMENT = "FORGOT_PASSWORD_FRAGMENT"
    const val HOME_FRAGMENT = "HOME_FRAGMENT"
    const val DATA_FRAGMENT = "DATA_FRAGMENT"
    const val SETTINGS_FRAGMENT = "SETTINGS_FRAGMENT"
    const val ABOUT_FRAGMENT = "ABOUT_FRAGMENT"
    const val UPDATE_TREE_FRAGMENT = "UPDATE_TREE_FRAGMENT"
    const val TREE_PREVIEW_FRAGMENT = "TREE_PREVIEW_FRAGMENT"
    const val EXIT_FRAGMENT = "EXIT_FRAGMENT"
    const val NOTE_FRAGMENT = "NOTE_FRAGMENT"
    const val UPDATE_TREE_DETAILS_FRAGMENT = "UPDATE_TREE_DETAILS_FRAGMENT"
    const val IDENTIFY_FRAGMENT = "IDENTIFY_FRAGMENT"
    const val USER_DETAILS_FRAGMENT = "USER_DETAILS_FRAGMENT"


    const val SHOW_SIGNUP_FRAGMENT = "SHOW_SIGNUP_FRAGMENT"
    const val SHOW_LOGIN_FRAGMENT = "SHOW_LOGIN_FRAGMENT"

    private const val intentsOffset = 1000
    const val INTENT_CAMERA = intentsOffset + 1

    /*MENU ITEMS*/
    const val MENU_HOME = "MENU_HOME"
    const val MENU_NEW_TREE = "MENU_NEW_TREE"
    const val MENU_UPDATE_TREE = "MENU_UPDATE_TREE"
    const val MENU_MAP = "MENU_MAP"
    const val MENU_DATA = "MENU_DATA"
    const val MENU_SETTINGS = "MENU_SETTINGS"
    const val MENU_EXIT = "MENU_EXIT"


    const val JPEG_FILE_PREFIX = "IMG_"
    const val JPEG_FILE_SUFFIX = ".jpg"


    var SPLASH_SCREEN_DURATION: Long = 1000


    const val TIME_TO_NEXT_UPDATE_GLOBAL_SETTING = "TIME_TO_NEXT_UPDATE_GLOBAL_SETTING"
    const val TIME_TO_NEXT_UPDATE_ADMIN_DB_SETTING = "TIME_TO_NEXT_UPDATE_ADMIN_DB_SETTING"
    const val TIME_TO_NEXT_UPDATE_ADMIN_DB_SETTING_PRESENT = "TIME_TO_NEXT_UPDATE_ADMIN_DB_SETTING_PRESENT"
    const val MIN_ACCURACY_GLOBAL_SETTING = "MIN_ACCURACY_GLOBAL_SETTING"
    const val MAIN_DB_USER_ID = "MAIN_DB_USER_ID"
    const val MAIN_DB_NEXT_UPDATE = "MAIN_DB_NEXT_UPDATE"
    const val MAIN_DB_MIN_ACCURACY = "MAIN_DB_MIN_ACCURACY"
    const val MAIN_USER_ID = "MAIN_USER_ID"
    const val MAIN_USER_FIRST_NAME = "MAIN_USER_FIRST_NAME"
    const val MAIN_USER_LAST_NAME = "MAIN_USER_LAST_NAME"
    const val TREE_ID = "TREE_ID"
    const val TREE_PHOTO = "TREE_PHOTO"
    const val PASSWORD = "PASSWORD"
    const val USERNAME = "USERNAME"
    const val TOKEN = "TOKEN"
    const val TREE_TRACKER_SETTINGS_USED = "TREE_TRACKER_SETTINGS_USED"
    const val FIRST_RUN = "FIRST_RUN"
    const val SAVE_AND_EDIT = "SAVE_AND_EDIT"
    const val TAKEN_IMAGE_PATH = "TAKEN_IMAGE_PATH"
    const val RUN_FROM_NOTIFICATION_SYNC = "RUN_FROM_NOTIFICATION_SYNC"
    const val RUN_FROM_HOME_ON_LOGIN = "RUN_FROM_HOME_ON_LOGIN"
    const val TREES_TO_BE_DOWNLOADED_FIRST = "TREES_TO_BE_DOWNLOADED_FIRST"

    const val TIME_TO_NEXT_UPDATE_DEFAULT_SETTING = 30
    const val MIN_ACCURACY_DEFAULT_SETTING = 10
    const val WIFI_NOTIFICATION_ID = 2000

    const val TIME_OF_LAST_USER_IDENTIFICATION = "TIME_OF_LAST_USER_IDENTIFICATION"
    const val PLANTER_IDENTIFIER = "PLANTER_IDENTIFIER"
    const val PLANTER_PHOTO = "PLANTER_PHOTO"
    const val PLANTER_IDENTIFIER_ID = "PLANTER_IDENTIFIER_ID"



    const val IDENTIFICATION_TIMEOUT = 60 * 60 * 2

    const val TAKE_SELFIE_EXTRA = "TAKE_SELFIE_EXTRA"
    const val V1_DATABASE_CHECKED = "V1_DATABASE_CHECKED"

    /*Login and SignUp feature const*/
    const val PHONE_NUMBER = "PHONE_NUMBER"
    const val EMAIL_ADDRESS = "EMAIL_ADDRESS"
}
