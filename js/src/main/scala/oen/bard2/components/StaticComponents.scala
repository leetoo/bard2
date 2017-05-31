package oen.bard2.components

import org.scalajs.dom.html.{Anchor, Div, Input}

import scalatags.JsDom.all._

case class StaticComponents (
  newRoomInput: Input = input(id := "new_room_name", `type` := "text").render,
  newRoomButton: Anchor = a(cls := "btn-floating btn-large waves-effect waves-light", i(cls := "material-icons", "add_box")).render,
  roomSearchInput: Input = input(id := "search", `type` := "search").render,

  addToPlaylistInput: Input = input(id := "add_to_playlist", `type` := "text").render,
  addToPlaylistButton: Anchor = a(cls := "btn-floating btn-large waves-effect waves-light", i(cls := "material-icons", "playlist_add")).render,

  playlist: Div = div(cls := "collection playlist").render,

  progressbar: Div = div(cls := "progress", div(cls := "indeterminate")).render,
  roomList: Div = div(cls := "collection rooms").render
)
