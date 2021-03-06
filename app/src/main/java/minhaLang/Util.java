package minhaLang;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.payfood.payfood.R;

import java.math.BigDecimal;

public class Util {

    public static void glidImage(ImageView imgLogo, String url, Context myFragment, int alternativa) {
        Glide
        .with(myFragment)
        .load(url)
        .fitCenter()
        .placeholder(alternativa)
        .crossFade()
        .into(imgLogo);
    }

    public static String getFormattedPrice(BigDecimal preco) {
        return "R$"+preco.toString().replace(".",",");
    }
}
