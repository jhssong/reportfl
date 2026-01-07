{
  "filepath": "/tmp/Compress-13b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 114,
      "end_line": 925,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 119,
      "end_line": 119,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 122,
      "end_line": 122,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 125,
      "end_line": 125,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 128,
      "end_line": 128,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 131,
      "end_line": 131,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 134,
      "end_line": 134,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The version of the format "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 148,
      "end_line": 148,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 151,
      "end_line": 151,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 154,
      "end_line": 154,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "isExtended"
      ],
      "begin_line": 157,
      "end_line": 157,
      "comment": " If an extension sparse header follows. "
    },
    {
      "type": "field",
      "varNames": [
        "realSize"
      ],
      "begin_line": 160,
      "end_line": 160,
      "comment": " The entry\u0027s real size in case of a sparse file. "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 163,
      "end_line": 163,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 166,
      "end_line": 166,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 169,
      "end_line": 169,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 172,
      "end_line": 172,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 175,
      "end_line": 175,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 180,
      "end_line": 197,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 181,col 9)-(line 181,col 33)",
        "(line 182,col 9)-(line 182,col 37)",
        "(line 183,col 9)-(line 183,col 23)",
        "(line 184,col 9)-(line 184,col 27)",
        "(line 186,col 9)-(line 186,col 58)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 24)",
        "(line 193,col 9)-(line 193,col 25)",
        "(line 194,col 9)-(line 194,col 29)",
        "(line 195,col 9)-(line 195,col 28)",
        "(line 196,col 9)-(line 196,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 205,
      "end_line": 207,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 206,col 9)-(line 206,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, boolean)",
      "begin_line": 219,
      "end_line": 240,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 220,col 9)-(line 220,col 15)",
        "(line 222,col 9)-(line 222,col 63)",
        "(line 223,col 9)-(line 223,col 43)",
        "(line 225,col 9)-(line 225,col 26)",
        "(line 226,col 9)-(line 226,col 26)",
        "(line 227,col 9)-(line 227,col 25)",
        "(line 228,col 9)-(line 228,col 65)",
        "(line 229,col 9)-(line 229,col 51)",
        "(line 230,col 9)-(line 230,col 24)",
        "(line 231,col 9)-(line 231,col 25)",
        "(line 232,col 9)-(line 232,col 22)",
        "(line 233,col 9)-(line 233,col 66)",
        "(line 234,col 9)-(line 234,col 27)",
        "(line 235,col 9)-(line 235,col 27)",
        "(line 236,col 9)-(line 236,col 28)",
        "(line 237,col 9)-(line 237,col 26)",
        "(line 238,col 9)-(line 238,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 248,
      "end_line": 255,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 249,col 9)-(line 249,col 19)",
        "(line 250,col 9)-(line 250,col 33)",
        "(line 251,col 9)-(line 254,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 264,
      "end_line": 266,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 265,col 9)-(line 265,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 275,
      "end_line": 303,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 15)",
        "(line 278,col 9)-(line 278,col 25)",
        "(line 280,col 9)-(line 280,col 27)",
        "(line 282,col 9)-(line 298,col 9)",
        "(line 300,col 9)-(line 300,col 63)",
        "(line 301,col 9)-(line 301,col 26)",
        "(line 302,col 9)-(line 302,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 312,
      "end_line": 315,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 15)",
        "(line 314,col 9)-(line 314,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 324,
      "end_line": 326,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 325,col 9)-(line 325,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 335,
      "end_line": 341,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 337,col 9)-(line 339,col 9)",
        "(line 340,col 9)-(line 340,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 348,
      "end_line": 351,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 397,
      "end_line": 399,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 398,col 9)-(line 398,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setLinkName(java.lang.String)",
      "begin_line": 408,
      "end_line": 410,
      "comment": "\n     * Set this entry\u0027s link name.\n     * \n     * @param link the link name to use.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 417,
      "end_line": 419,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     ",
      "child_ranges": [
        "(line 418,col 9)-(line 418,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 426,
      "end_line": 428,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 427,col 9)-(line 427,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 435,
      "end_line": 437,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 436,col 9)-(line 436,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 490,
      "end_line": 493,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 26)",
        "(line 492,col 9)-(line 492,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 501,
      "end_line": 504,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 30)",
        "(line 503,col 9)-(line 503,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 512,
      "end_line": 514,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 521,
      "end_line": 523,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate()",
      "begin_line": 535,
      "end_line": 537,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 536,col 9)-(line 536,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 553,
      "end_line": 555,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 554,col 9)-(line 554,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 562,
      "end_line": 564,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 563,col 9)-(line 563,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 572,
      "end_line": 577,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 576,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isExtended()",
      "begin_line": 585,
      "end_line": 587,
      "comment": "\n     * Indicates in case of a sparse file if an extension sparse header\n     * follows.\n     *\n     * @return true if an extension sparse header follows.\n     ",
      "child_ranges": [
        "(line 586,col 9)-(line 586,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getRealSize()",
      "begin_line": 594,
      "end_line": 596,
      "comment": "\n     * Get this entry\u0027s real file size in case of a sparse file.\n     *\n     * @return This entry\u0027s real file size.\n     ",
      "child_ranges": [
        "(line 595,col 9)-(line 595,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNUSparse()",
      "begin_line": 603,
      "end_line": 605,
      "comment": "\n     * Indicate if this entry is a GNU sparse block \n     *\n     * @return true if this is a sparse extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 604,col 9)-(line 604,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 612,
      "end_line": 615,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 613,col 9)-(line 614,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxHeader()",
      "begin_line": 624,
      "end_line": 627,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if this is a Pax header.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 625,col 9)-(line 626,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGlobalPaxHeader()",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if this is a Pax header.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 645,
      "end_line": 659,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 646,col 9)-(line 648,col 9)",
        "(line 650,col 9)-(line 652,col 9)",
        "(line 654,col 9)-(line 656,col 9)",
        "(line 658,col 9)-(line 658,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile()",
      "begin_line": 666,
      "end_line": 674,
      "comment": "\n     * Check if this is a \"normal file\"\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 667,col 9)-(line 669,col 9)",
        "(line 670,col 9)-(line 672,col 9)",
        "(line 673,col 9)-(line 673,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSymbolicLink()",
      "begin_line": 681,
      "end_line": 683,
      "comment": "\n     * Check if this is a symbolic link entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 682,col 9)-(line 682,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isLink()",
      "begin_line": 690,
      "end_line": 692,
      "comment": "\n     * Check if this is a link entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 691,col 9)-(line 691,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCharacterDevice()",
      "begin_line": 699,
      "end_line": 701,
      "comment": "\n     * Check if this is a character device entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 700,col 9)-(line 700,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isBlockDevice()",
      "begin_line": 708,
      "end_line": 710,
      "comment": "\n     * Check if this is a block device entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 709,col 9)-(line 709,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFIFO()",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\n     * Check if this is a FIFO (pipe) entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 727,
      "end_line": 740,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 728,col 9)-(line 730,col 9)",
        "(line 732,col 9)-(line 732,col 38)",
        "(line 733,col 9)-(line 733,col 68)",
        "(line 735,col 9)-(line 737,col 9)",
        "(line 739,col 9)-(line 739,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 749,
      "end_line": 751,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * \u003cp\u003eThis method does not use the star/GNU tar/BSD tar extensions.\u003c/p\u003e\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 750,col 9)-(line 750,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[], boolean)",
      "begin_line": 761,
      "end_line": 798,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     * @param starMode whether to use the star/GNU tar/BSD tar\n     * extension for the size field if the size is bigger than 8GiB\n     * @since Apache Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 762,col 9)-(line 762,col 23)",
        "(line 764,col 9)-(line 764,col 73)",
        "(line 765,col 9)-(line 765,col 74)",
        "(line 766,col 9)-(line 766,col 75)",
        "(line 767,col 9)-(line 767,col 76)",
        "(line 768,col 9)-(line 773,col 9)",
        "(line 774,col 9)-(line 774,col 84)",
        "(line 776,col 9)-(line 776,col 30)",
        "(line 778,col 9)-(line 780,col 9)",
        "(line 782,col 9)-(line 782,col 36)",
        "(line 783,col 9)-(line 783,col 77)",
        "(line 784,col 9)-(line 784,col 75)",
        "(line 785,col 9)-(line 785,col 79)",
        "(line 786,col 9)-(line 786,col 78)",
        "(line 787,col 9)-(line 787,col 79)",
        "(line 788,col 9)-(line 788,col 77)",
        "(line 789,col 9)-(line 789,col 77)",
        "(line 791,col 9)-(line 793,col 9)",
        "(line 795,col 9)-(line 795,col 52)",
        "(line 797,col 9)-(line 797,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 806,
      "end_line": 866,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 23)",
        "(line 809,col 9)-(line 809,col 59)",
        "(line 810,col 9)-(line 810,col 26)",
        "(line 811,col 9)-(line 811,col 66)",
        "(line 812,col 9)-(line 812,col 26)",
        "(line 813,col 9)-(line 813,col 75)",
        "(line 814,col 9)-(line 814,col 25)",
        "(line 815,col 9)-(line 815,col 76)",
        "(line 816,col 9)-(line 816,col 25)",
        "(line 817,col 9)-(line 817,col 68)",
        "(line 818,col 9)-(line 818,col 26)",
        "(line 819,col 9)-(line 819,col 66)",
        "(line 820,col 9)-(line 820,col 29)",
        "(line 821,col 9)-(line 821,col 28)",
        "(line 822,col 9)-(line 822,col 36)",
        "(line 823,col 9)-(line 823,col 63)",
        "(line 824,col 9)-(line 824,col 26)",
        "(line 825,col 9)-(line 825,col 61)",
        "(line 826,col 9)-(line 826,col 27)",
        "(line 827,col 9)-(line 827,col 65)",
        "(line 828,col 9)-(line 828,col 29)",
        "(line 829,col 9)-(line 829,col 64)",
        "(line 830,col 9)-(line 830,col 27)",
        "(line 831,col 9)-(line 831,col 65)",
        "(line 832,col 9)-(line 832,col 27)",
        "(line 833,col 9)-(line 833,col 69)",
        "(line 834,col 9)-(line 834,col 25)",
        "(line 835,col 9)-(line 835,col 69)",
        "(line 836,col 9)-(line 836,col 25)",
        "(line 838,col 9)-(line 838,col 40)",
        "(line 839,col 9)-(line 865,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String, boolean)",
      "begin_line": 872,
      "end_line": 909,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 874,col 9)-(line 874,col 82)",
        "(line 876,col 9)-(line 898,col 9)",
        "(line 900,col 9)-(line 900,col 61)",
        "(line 905,col 9)-(line 907,col 9)",
        "(line 908,col 9)-(line 908,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType(byte[])",
      "begin_line": 917,
      "end_line": 924,
      "comment": "\n     * Evaluate an entry\u0027s header format from a header buffer.\n     *\n     * @param header The tar entry header buffer to evaluate the format for.\n     * @return format type\n     ",
      "child_ranges": [
        "(line 918,col 9)-(line 918,col 81)",
        "(line 919,col 9)-(line 920,col 33)",
        "(line 921,col 9)-(line 922,col 32)",
        "(line 923,col 9)-(line 923,col 17)"
      ]
    }
  ]
}