package net.fehmicansaglam.tepkin.protocol.result

sealed trait Result

case class CountResult(missing: Option[Boolean] = None, n: Long, ok: Boolean) extends Result

case class DeleteResult(n: Option[Int], code: Option[Int], errmsg: Option[String], ok: Boolean) extends Result

case class InsertResult(n: Int, ok: Boolean) extends Result
