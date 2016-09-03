package com.terrainahead.radio

case class Frequency(hz: Long) {
  def inMhz() = hz / 1000
}

object Frequency {
  def fromMhz(mhz: Long) = new Frequency(mhz * 1000)
}


