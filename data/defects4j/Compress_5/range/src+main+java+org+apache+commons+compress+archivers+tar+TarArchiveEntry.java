{
  "filepath": "/tmp/Compress-5b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
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
      "end_line": 699,
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
      "end_line": 171,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, boolean)",
      "begin_line": 181,
      "end_line": 202,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     ",
      "child_ranges": [
        "(line 182,col 9)-(line 182,col 15)",
        "(line 184,col 9)-(line 184,col 63)",
        "(line 185,col 9)-(line 185,col 43)",
        "(line 187,col 9)-(line 187,col 26)",
        "(line 188,col 9)-(line 188,col 26)",
        "(line 189,col 9)-(line 189,col 25)",
        "(line 190,col 9)-(line 190,col 65)",
        "(line 191,col 9)-(line 191,col 51)",
        "(line 192,col 9)-(line 192,col 24)",
        "(line 193,col 9)-(line 193,col 25)",
        "(line 194,col 9)-(line 194,col 22)",
        "(line 195,col 9)-(line 195,col 66)",
        "(line 196,col 9)-(line 196,col 27)",
        "(line 197,col 9)-(line 197,col 27)",
        "(line 198,col 9)-(line 198,col 28)",
        "(line 199,col 9)-(line 199,col 26)",
        "(line 200,col 9)-(line 200,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 210,
      "end_line": 217,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 211,col 9)-(line 211,col 19)",
        "(line 212,col 9)-(line 212,col 33)",
        "(line 213,col 9)-(line 216,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 226,
      "end_line": 228,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 227,col 9)-(line 227,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 237,
      "end_line": 265,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 238,col 9)-(line 238,col 15)",
        "(line 240,col 9)-(line 240,col 25)",
        "(line 242,col 9)-(line 242,col 27)",
        "(line 244,col 9)-(line 260,col 9)",
        "(line 262,col 9)-(line 262,col 63)",
        "(line 263,col 9)-(line 263,col 26)",
        "(line 264,col 9)-(line 264,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 273,
      "end_line": 276,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     ",
      "child_ranges": [
        "(line 274,col 9)-(line 274,col 15)",
        "(line 275,col 9)-(line 275,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 285,
      "end_line": 287,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 286,col 9)-(line 286,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 296,
      "end_line": 301,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 299,col 9)",
        "(line 300,col 9)-(line 300,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 320,
      "end_line": 322,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 321,col 9)-(line 321,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 329,
      "end_line": 331,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 330,col 9)-(line 330,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 338,
      "end_line": 340,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 339,col 9)-(line 339,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 347,
      "end_line": 349,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 348,col 9)-(line 348,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 356,
      "end_line": 358,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 357,col 9)-(line 357,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 374,
      "end_line": 376,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 375,col 9)-(line 375,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 392,
      "end_line": 394,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 393,col 9)-(line 393,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 401,
      "end_line": 403,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 402,col 9)-(line 402,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 410,
      "end_line": 412,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 419,
      "end_line": 421,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 420,col 9)-(line 420,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 428,
      "end_line": 430,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 429,col 9)-(line 429,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 438,
      "end_line": 441,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 26)",
        "(line 440,col 9)-(line 440,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 449,
      "end_line": 452,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 30)",
        "(line 451,col 9)-(line 451,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 460,
      "end_line": 462,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 461,col 9)-(line 461,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 469,
      "end_line": 471,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 470,col 9)-(line 470,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 478,
      "end_line": 480,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 479,col 9)-(line 479,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate()",
      "begin_line": 483,
      "end_line": 485,
      "comment": " {@inheritDocs} ",
      "child_ranges": [
        "(line 484,col 9)-(line 484,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 492,
      "end_line": 494,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 493,col 9)-(line 493,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 501,
      "end_line": 503,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 502,col 9)-(line 502,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 510,
      "end_line": 512,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 511,col 9)-(line 511,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 521,
      "end_line": 526,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u003c 0\n     * or \u003e {@link TarConstants#MAXSIZE} (077777777777L).\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 524,col 9)",
        "(line 525,col 9)-(line 525,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 534,
      "end_line": 537,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 535,col 9)-(line 536,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 544,
      "end_line": 558,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 545,col 9)-(line 547,col 9)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 555,col 9)",
        "(line 557,col 9)-(line 557,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 566,
      "end_line": 579,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 571,col 9)-(line 571,col 38)",
        "(line 572,col 9)-(line 572,col 68)",
        "(line 574,col 9)-(line 576,col 9)",
        "(line 578,col 9)-(line 578,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 586,
      "end_line": 618,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 23)",
        "(line 589,col 9)-(line 589,col 73)",
        "(line 590,col 9)-(line 590,col 74)",
        "(line 591,col 9)-(line 591,col 75)",
        "(line 592,col 9)-(line 592,col 76)",
        "(line 593,col 9)-(line 593,col 78)",
        "(line 594,col 9)-(line 594,col 84)",
        "(line 596,col 9)-(line 596,col 30)",
        "(line 598,col 9)-(line 600,col 9)",
        "(line 602,col 9)-(line 602,col 36)",
        "(line 603,col 9)-(line 603,col 77)",
        "(line 604,col 9)-(line 604,col 75)",
        "(line 605,col 9)-(line 605,col 79)",
        "(line 606,col 9)-(line 606,col 78)",
        "(line 607,col 9)-(line 607,col 79)",
        "(line 608,col 9)-(line 608,col 77)",
        "(line 609,col 9)-(line 609,col 77)",
        "(line 611,col 9)-(line 613,col 9)",
        "(line 615,col 9)-(line 615,col 52)",
        "(line 617,col 9)-(line 617,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 625,
      "end_line": 655,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     ",
      "child_ranges": [
        "(line 626,col 9)-(line 626,col 23)",
        "(line 628,col 9)-(line 628,col 59)",
        "(line 629,col 9)-(line 629,col 26)",
        "(line 630,col 9)-(line 630,col 66)",
        "(line 631,col 9)-(line 631,col 26)",
        "(line 632,col 9)-(line 632,col 67)",
        "(line 633,col 9)-(line 633,col 25)",
        "(line 634,col 9)-(line 634,col 68)",
        "(line 635,col 9)-(line 635,col 25)",
        "(line 636,col 9)-(line 636,col 60)",
        "(line 637,col 9)-(line 637,col 26)",
        "(line 638,col 9)-(line 638,col 66)",
        "(line 639,col 9)-(line 639,col 29)",
        "(line 640,col 9)-(line 640,col 28)",
        "(line 641,col 9)-(line 641,col 36)",
        "(line 642,col 9)-(line 642,col 63)",
        "(line 643,col 9)-(line 643,col 26)",
        "(line 644,col 9)-(line 644,col 61)",
        "(line 645,col 9)-(line 645,col 27)",
        "(line 646,col 9)-(line 646,col 65)",
        "(line 647,col 9)-(line 647,col 29)",
        "(line 648,col 9)-(line 648,col 64)",
        "(line 649,col 9)-(line 649,col 27)",
        "(line 650,col 9)-(line 650,col 65)",
        "(line 651,col 9)-(line 651,col 27)",
        "(line 652,col 9)-(line 652,col 69)",
        "(line 653,col 9)-(line 653,col 25)",
        "(line 654,col 9)-(line 654,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String, boolean)",
      "begin_line": 661,
      "end_line": 698,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 663,col 9)-(line 663,col 77)",
        "(line 665,col 9)-(line 687,col 9)",
        "(line 689,col 9)-(line 689,col 61)",
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 24)"
      ]
    }
  ]
}