package net.ralphpina.home.view.di

import net.ralphpina.home.view.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val homeViewModule = module {
    viewModel { HomeViewModel() }
}