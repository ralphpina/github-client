package net.ralphpina.home.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.Composable
import androidx.ui.foundation.Text
import androidx.compose.Recomposer
import androidx.fragment.app.Fragment
import androidx.ui.core.setContent
import androidx.ui.material.MaterialTheme
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    private val homeViewModel: HomeViewModel by viewModel()

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)

        (root as ViewGroup).setContent(Recomposer.current()) {
            Hello("Jetpack Compose")
        }

//        homeViewModel.text.observe(viewLifecycleOwner, Observer {
//            text_home.text = it
//        })
        return root
    }

    @Composable
    fun Hello(name: String) = MaterialTheme {
        Text("Hello $name!") // Text label
//        FlexColumn {
//            inflexible {
//                // Item height will be equal content height
//                TopAppBar( // App Bar with title
//                    title = { Text("Jetpack Compose Sample") }
//                )
//            }
//            expanded(1F) {
//                // occupy whole empty space in the Column
//                Center {
//                    // Center content
//                    Text("Hello $name!") // Text label
//                }
//            }
//        }
    }
}