package br.com.apkdoandroid.politicadeprivacidadeetermodeuso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.LinkMovementMethod
import android.text.util.Linkify
import androidx.core.text.HtmlCompat
import br.com.apkdoandroid.politicadeprivacidadeetermodeuso.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        politicaDePrivacidadeETermo()
    }

    private fun politicaDePrivacidadeETermo(){
         var texto = "<string name=\"apkdoandroid_terms_privacy_text\">Ao enviar os dados," +
                 " você concorda com o <a href=\"https://www.google.com.br/\">" +
                 "termo de uso do serviço</a> e <a href=\"https://www.google.com.br/\"> " +
                 "nossa política de privacidade</a>.</string>"


       // texto = getString(R.string.apkdoandroid_terms_privacy_text)
         val spannedText = HtmlCompat.fromHtml(texto, HtmlCompat.FROM_HTML_MODE_LEGACY)
         val textView = binding.texviewPrivacidaeTermo
         textView.setText(spannedText)
         textView.movementMethod = LinkMovementMethod.getInstance()
         textView.setAutoLinkMask(Linkify.WEB_URLS);
         textView.setLinksClickable(true);
    }
}