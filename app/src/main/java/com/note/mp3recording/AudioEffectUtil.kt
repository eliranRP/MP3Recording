package com.note.mp3recording

import android.media.audiofx.AudioEffect

import java.util.UUID

object AudioEffectUtil {

    val SETTINGS_PREFS = "RecordServiceSettings"
    val AUTO_GAIN_CONTROL_KEY = "AUTO_GAIN_CONTROL_KEY"
    val BASS_STRENGTH = "PARAM_STRENGTH"
    val NOISE_SUPPRESSION_KEY = "NOISE_SUPPRESSION_KEY"
    val BASS_BOOST_DEFAULT_ENABLED = "BASS_BOOST_DEFAULT_ENABLED"
    val EQUALIZER_DEFAULT_ENABLED = "EQUALIZER_DEFAULT_ENABLED"
    val EQUALIZER_LEVEL_1 = "EQUALIZER_LEVEL_1"
    val EQUALIZER_LEVEL_2 = "EQUALIZER_LEVEL_2"
    val EQUALIZER_LEVEL_3 = "EQUALIZER_LEVEL_3"
    val EQUALIZER_LEVEL_4 = "EQUALIZER_LEVEL_4"
    //public static final String EQUALIZER_LEVEL_5 = "EQUALIZER_LEVEL_5";

    /**
     * Supporter method for checking if audio effect works
     * @param effect
     * The audio effect to check against
     * @return
     * True if it is supported
     */
    fun isSupported(effect: UUID): Boolean {
        val effects = AudioEffect.queryEffects()
        for (audioDesc in effects) {
            if (audioDesc.type.compareTo(effect) == 0) {
                return true
            }
        }
        return false
    }
}
