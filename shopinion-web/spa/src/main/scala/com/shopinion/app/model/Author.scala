/*
 * Copyright 2008 WorldWide Conferencing, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.shopinion.app {
package model {

import _root_.javax.persistence._

/**
  An author is someone who writes books.
*/
@Entity
class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  var id : Long = _

  @Column(unique = true, nullable = false)
  var name : String = ""

  @OneToMany(mappedBy = "author", targetEntity = classOf[Book])
  var books : _root_.java.util.Set[Book] = new _root_.java.util.HashSet[Book]()
}
}
}
