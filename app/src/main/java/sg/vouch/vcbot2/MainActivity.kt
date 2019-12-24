package sg.vouch.vcbot2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adyabukhari.pixalist.PixaList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var apiKey = "14722032-068323abc9a77b7bc19fbd5d4"; // NOTE : YOU CAN PUT ON Values/String. THIS IS JUST EXAMPLE
        var query = "blue cars"; // Defines type of images query

        var pixaList: PixaList = findViewById(R.id.MypixaList) as PixaList;
        pixaList.APIKEY = apiKey;
        pixaList.currentQuery = query;
        pixaList.StartPixabayList();
    }
}
