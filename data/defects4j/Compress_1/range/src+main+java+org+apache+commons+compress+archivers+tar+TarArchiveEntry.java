{
  "filepath": "/tmp/Compress-1b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 76,
      "end_line": 645,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 78,
      "end_line": 78,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 81,
      "end_line": 81,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 87,
      "end_line": 87,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 90,
      "end_line": 90,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 93,
      "end_line": 93,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 99,
      "end_line": 99,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 108,
      "end_line": 108,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 134,
      "end_line": 150,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 135,col 9)-(line 135,col 46)",
        "(line 136,col 9)-(line 136,col 39)",
        "(line 137,col 9)-(line 137,col 43)",
        "(line 139,col 9)-(line 139,col 58)",
        "(line 141,col 9)-(line 143,col 9)",
        "(line 145,col 9)-(line 145,col 24)",
        "(line 146,col 9)-(line 146,col 25)",
        "(line 147,col 9)-(line 147,col 47)",
        "(line 148,col 9)-(line 148,col 46)",
        "(line 149,col 9)-(line 149,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 158,
      "end_line": 179,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 159,col 15)",
        "(line 161,col 9)-(line 161,col 39)",
        "(line 162,col 9)-(line 162,col 43)",
        "(line 164,col 9)-(line 164,col 26)",
        "(line 165,col 9)-(line 165,col 26)",
        "(line 166,col 9)-(line 166,col 43)",
        "(line 167,col 9)-(line 167,col 65)",
        "(line 168,col 9)-(line 168,col 51)",
        "(line 169,col 9)-(line 169,col 24)",
        "(line 170,col 9)-(line 170,col 25)",
        "(line 171,col 9)-(line 171,col 22)",
        "(line 172,col 9)-(line 172,col 66)",
        "(line 173,col 9)-(line 173,col 45)",
        "(line 174,col 9)-(line 174,col 45)",
        "(line 175,col 9)-(line 175,col 46)",
        "(line 176,col 9)-(line 176,col 26)",
        "(line 177,col 9)-(line 177,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 187,
      "end_line": 190,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 188,col 9)-(line 188,col 19)",
        "(line 189,col 9)-(line 189,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 198,
      "end_line": 225,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 15)",
        "(line 201,col 9)-(line 201,col 25)",
        "(line 203,col 9)-(line 203,col 60)",
        "(line 204,col 9)-(line 204,col 45)",
        "(line 205,col 9)-(line 205,col 47)",
        "(line 207,col 9)-(line 220,col 9)",
        "(line 222,col 9)-(line 222,col 63)",
        "(line 223,col 9)-(line 223,col 26)",
        "(line 224,col 9)-(line 224,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 233,
      "end_line": 236,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     ",
      "child_ranges": [
        "(line 234,col 9)-(line 234,col 15)",
        "(line 235,col 9)-(line 235,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 245,
      "end_line": 247,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 256,
      "end_line": 261,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 257,col 9)-(line 259,col 9)",
        "(line 260,col 9)-(line 260,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 268,
      "end_line": 270,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 269,col 9)-(line 269,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 280,
      "end_line": 282,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 281,col 9)-(line 281,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 289,
      "end_line": 291,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 290,col 9)-(line 290,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 298,
      "end_line": 300,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 299,col 9)-(line 299,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 307,
      "end_line": 309,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 316,
      "end_line": 318,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 317,col 9)-(line 317,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 325,
      "end_line": 327,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     ",
      "child_ranges": [
        "(line 326,col 9)-(line 326,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 343,
      "end_line": 345,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 352,
      "end_line": 354,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 353,col 9)-(line 353,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 361,
      "end_line": 363,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 362,col 9)-(line 362,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 370,
      "end_line": 372,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 371,col 9)-(line 371,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 379,
      "end_line": 381,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 380,col 9)-(line 380,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 388,
      "end_line": 390,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 389,col 9)-(line 389,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 398,
      "end_line": 401,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 26)",
        "(line 400,col 9)-(line 400,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 409,
      "end_line": 412,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 410,col 9)-(line 410,col 30)",
        "(line 411,col 9)-(line 411,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 484,
      "end_line": 487,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 486,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 494,
      "end_line": 508,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 495,col 9)-(line 497,col 9)",
        "(line 499,col 9)-(line 501,col 9)",
        "(line 503,col 9)-(line 505,col 9)",
        "(line 507,col 9)-(line 507,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 516,
      "end_line": 529,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 517,col 9)-(line 519,col 9)",
        "(line 521,col 9)-(line 521,col 38)",
        "(line 522,col 9)-(line 522,col 68)",
        "(line 524,col 9)-(line 526,col 9)",
        "(line 528,col 9)-(line 528,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 536,
      "end_line": 567,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 537,col 9)-(line 537,col 23)",
        "(line 539,col 9)-(line 539,col 70)",
        "(line 540,col 9)-(line 540,col 71)",
        "(line 541,col 9)-(line 541,col 72)",
        "(line 542,col 9)-(line 542,col 73)",
        "(line 543,col 9)-(line 543,col 75)",
        "(line 544,col 9)-(line 544,col 81)",
        "(line 546,col 9)-(line 546,col 30)",
        "(line 548,col 9)-(line 550,col 9)",
        "(line 552,col 9)-(line 552,col 36)",
        "(line 553,col 9)-(line 553,col 74)",
        "(line 554,col 9)-(line 554,col 72)",
        "(line 555,col 9)-(line 555,col 75)",
        "(line 556,col 9)-(line 556,col 76)",
        "(line 557,col 9)-(line 557,col 74)",
        "(line 558,col 9)-(line 558,col 74)",
        "(line 560,col 9)-(line 562,col 9)",
        "(line 564,col 9)-(line 564,col 52)",
        "(line 566,col 9)-(line 566,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 574,
      "end_line": 602,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     ",
      "child_ranges": [
        "(line 575,col 9)-(line 575,col 23)",
        "(line 577,col 9)-(line 577,col 59)",
        "(line 578,col 9)-(line 578,col 26)",
        "(line 579,col 9)-(line 579,col 66)",
        "(line 580,col 9)-(line 580,col 26)",
        "(line 581,col 9)-(line 581,col 67)",
        "(line 582,col 9)-(line 582,col 25)",
        "(line 583,col 9)-(line 583,col 68)",
        "(line 584,col 9)-(line 584,col 25)",
        "(line 585,col 9)-(line 585,col 60)",
        "(line 586,col 9)-(line 586,col 26)",
        "(line 587,col 9)-(line 587,col 66)",
        "(line 588,col 9)-(line 588,col 29)",
        "(line 589,col 9)-(line 589,col 28)",
        "(line 590,col 9)-(line 590,col 36)",
        "(line 591,col 9)-(line 591,col 63)",
        "(line 592,col 9)-(line 592,col 26)",
        "(line 593,col 9)-(line 593,col 61)",
        "(line 594,col 9)-(line 594,col 27)",
        "(line 595,col 9)-(line 595,col 64)",
        "(line 596,col 9)-(line 596,col 27)",
        "(line 597,col 9)-(line 597,col 65)",
        "(line 598,col 9)-(line 598,col 27)",
        "(line 599,col 9)-(line 599,col 69)",
        "(line 600,col 9)-(line 600,col 25)",
        "(line 601,col 9)-(line 601,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String)",
      "begin_line": 608,
      "end_line": 644,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 609,col 9)-(line 609,col 77)",
        "(line 611,col 9)-(line 633,col 9)",
        "(line 635,col 9)-(line 635,col 61)",
        "(line 640,col 9)-(line 642,col 9)",
        "(line 643,col 9)-(line 643,col 24)"
      ]
    }
  ]
}