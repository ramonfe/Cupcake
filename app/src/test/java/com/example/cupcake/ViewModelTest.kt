package com.example.cupcake

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.example.cupcake.model.OrderViewModel
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test


class ViewModelTests {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var viewModel: OrderViewModel

    @Before
    fun setup() {
        viewModel = OrderViewModel()
    }

    @Test
    fun quantity_twelve_cupcakes() {
        viewModel.setQuantity(12)
        assertEquals(12, viewModel.quantity.value)
    }

    @Test
    fun price_twelve_cupcakes() {
        viewModel.setQuantity(6)
        viewModel.price.observeForever {}
        assertEquals("$15.00", viewModel.price.value)
    }
    @Test
    fun delivery_date(){
        viewModel.setDate("01/21/2022")
        assertEquals("01/21/2022",viewModel.date.value)
    }
}