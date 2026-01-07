{
  "filepath": "/tmp/Compress-4b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 84,
      "end_line": 677,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 89,
      "end_line": 89,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 95,
      "end_line": 95,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 98,
      "end_line": 98,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 104,
      "end_line": 104,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 107,
      "end_line": 107,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 110,
      "end_line": 110,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The version of the format "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 144,
      "end_line": 161,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 145,col 9)-(line 145,col 33)",
        "(line 146,col 9)-(line 146,col 37)",
        "(line 147,col 9)-(line 147,col 23)",
        "(line 148,col 9)-(line 148,col 27)",
        "(line 150,col 9)-(line 150,col 58)",
        "(line 152,col 9)-(line 154,col 9)",
        "(line 156,col 9)-(line 156,col 24)",
        "(line 157,col 9)-(line 157,col 25)",
        "(line 158,col 9)-(line 158,col 29)",
        "(line 159,col 9)-(line 159,col 28)",
        "(line 160,col 9)-(line 160,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 169,
      "end_line": 190,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 15)",
        "(line 172,col 9)-(line 172,col 39)",
        "(line 173,col 9)-(line 173,col 43)",
        "(line 175,col 9)-(line 175,col 26)",
        "(line 176,col 9)-(line 176,col 26)",
        "(line 177,col 9)-(line 177,col 25)",
        "(line 178,col 9)-(line 178,col 65)",
        "(line 179,col 9)-(line 179,col 51)",
        "(line 180,col 9)-(line 180,col 24)",
        "(line 181,col 9)-(line 181,col 25)",
        "(line 182,col 9)-(line 182,col 22)",
        "(line 183,col 9)-(line 183,col 66)",
        "(line 184,col 9)-(line 184,col 27)",
        "(line 185,col 9)-(line 185,col 27)",
        "(line 186,col 9)-(line 186,col 28)",
        "(line 187,col 9)-(line 187,col 26)",
        "(line 188,col 9)-(line 188,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 198,
      "end_line": 201,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 19)",
        "(line 200,col 9)-(line 200,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 210,
      "end_line": 212,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 54)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 221,
      "end_line": 249,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 222,col 9)-(line 222,col 15)",
        "(line 224,col 9)-(line 224,col 25)",
        "(line 226,col 9)-(line 226,col 27)",
        "(line 228,col 9)-(line 244,col 9)",
        "(line 246,col 9)-(line 246,col 63)",
        "(line 247,col 9)-(line 247,col 26)",
        "(line 248,col 9)-(line 248,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 257,
      "end_line": 260,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 258,col 15)",
        "(line 259,col 9)-(line 259,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 280,
      "end_line": 285,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 283,col 9)",
        "(line 284,col 9)-(line 284,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 292,
      "end_line": 294,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 293,col 9)-(line 293,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 304,
      "end_line": 306,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 305,col 9)-(line 305,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 313,
      "end_line": 315,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 314,col 9)-(line 314,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 322,
      "end_line": 324,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 331,
      "end_line": 333,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 332,col 9)-(line 332,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 340,
      "end_line": 342,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 341,col 9)-(line 341,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 349,
      "end_line": 351,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     ",
      "child_ranges": [
        "(line 350,col 9)-(line 350,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 358,
      "end_line": 360,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 359,col 9)-(line 359,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 367,
      "end_line": 369,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 368,col 9)-(line 368,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 376,
      "end_line": 378,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 377,col 9)-(line 377,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 385,
      "end_line": 387,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 386,col 9)-(line 386,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 394,
      "end_line": 396,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 395,col 9)-(line 395,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 403,
      "end_line": 405,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 404,col 9)-(line 404,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 412,
      "end_line": 414,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 422,
      "end_line": 425,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 423,col 9)-(line 423,col 26)",
        "(line 424,col 9)-(line 424,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 433,
      "end_line": 436,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 434,col 9)-(line 434,col 30)",
        "(line 435,col 9)-(line 435,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 444,
      "end_line": 446,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 445,col 9)-(line 445,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 453,
      "end_line": 455,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 454,col 9)-(line 454,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 462,
      "end_line": 464,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 463,col 9)-(line 463,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 471,
      "end_line": 473,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 472,col 9)-(line 472,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 480,
      "end_line": 482,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 500,
      "end_line": 505,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u003c 0\n     * or \u003e {@link TarConstants#MAXSIZE} (077777777777L).\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 503,col 9)",
        "(line 504,col 9)-(line 504,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 513,
      "end_line": 516,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 514,col 9)-(line 515,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 523,
      "end_line": 537,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 524,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 530,col 9)",
        "(line 532,col 9)-(line 534,col 9)",
        "(line 536,col 9)-(line 536,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 545,
      "end_line": 558,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 546,col 9)-(line 548,col 9)",
        "(line 550,col 9)-(line 550,col 38)",
        "(line 551,col 9)-(line 551,col 68)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 557,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 565,
      "end_line": 597,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 566,col 9)-(line 566,col 23)",
        "(line 568,col 9)-(line 568,col 73)",
        "(line 569,col 9)-(line 569,col 74)",
        "(line 570,col 9)-(line 570,col 75)",
        "(line 571,col 9)-(line 571,col 76)",
        "(line 572,col 9)-(line 572,col 78)",
        "(line 573,col 9)-(line 573,col 84)",
        "(line 575,col 9)-(line 575,col 30)",
        "(line 577,col 9)-(line 579,col 9)",
        "(line 581,col 9)-(line 581,col 36)",
        "(line 582,col 9)-(line 582,col 77)",
        "(line 583,col 9)-(line 583,col 75)",
        "(line 584,col 9)-(line 584,col 79)",
        "(line 585,col 9)-(line 585,col 78)",
        "(line 586,col 9)-(line 586,col 79)",
        "(line 587,col 9)-(line 587,col 77)",
        "(line 588,col 9)-(line 588,col 77)",
        "(line 590,col 9)-(line 592,col 9)",
        "(line 594,col 9)-(line 594,col 52)",
        "(line 596,col 9)-(line 596,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 604,
      "end_line": 634,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     ",
      "child_ranges": [
        "(line 605,col 9)-(line 605,col 23)",
        "(line 607,col 9)-(line 607,col 59)",
        "(line 608,col 9)-(line 608,col 26)",
        "(line 609,col 9)-(line 609,col 66)",
        "(line 610,col 9)-(line 610,col 26)",
        "(line 611,col 9)-(line 611,col 67)",
        "(line 612,col 9)-(line 612,col 25)",
        "(line 613,col 9)-(line 613,col 68)",
        "(line 614,col 9)-(line 614,col 25)",
        "(line 615,col 9)-(line 615,col 60)",
        "(line 616,col 9)-(line 616,col 26)",
        "(line 617,col 9)-(line 617,col 66)",
        "(line 618,col 9)-(line 618,col 29)",
        "(line 619,col 9)-(line 619,col 28)",
        "(line 620,col 9)-(line 620,col 36)",
        "(line 621,col 9)-(line 621,col 63)",
        "(line 622,col 9)-(line 622,col 26)",
        "(line 623,col 9)-(line 623,col 61)",
        "(line 624,col 9)-(line 624,col 27)",
        "(line 625,col 9)-(line 625,col 65)",
        "(line 626,col 9)-(line 626,col 29)",
        "(line 627,col 9)-(line 627,col 64)",
        "(line 628,col 9)-(line 628,col 27)",
        "(line 629,col 9)-(line 629,col 65)",
        "(line 630,col 9)-(line 630,col 27)",
        "(line 631,col 9)-(line 631,col 69)",
        "(line 632,col 9)-(line 632,col 25)",
        "(line 633,col 9)-(line 633,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String)",
      "begin_line": 640,
      "end_line": 676,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 641,col 9)-(line 641,col 77)",
        "(line 643,col 9)-(line 665,col 9)",
        "(line 667,col 9)-(line 667,col 61)",
        "(line 672,col 9)-(line 674,col 9)",
        "(line 675,col 9)-(line 675,col 24)"
      ]
    }
  ]
}