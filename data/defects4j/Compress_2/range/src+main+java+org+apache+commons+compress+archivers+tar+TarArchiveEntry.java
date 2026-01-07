{
  "filepath": "/tmp/Compress-2b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 77,
      "end_line": 646,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 79,
      "end_line": 79,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 82,
      "end_line": 82,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 88,
      "end_line": 88,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 94,
      "end_line": 94,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 100,
      "end_line": 100,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 103,
      "end_line": 103,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 109,
      "end_line": 109,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 135,
      "end_line": 151,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 136,col 9)-(line 136,col 46)",
        "(line 137,col 9)-(line 137,col 39)",
        "(line 138,col 9)-(line 138,col 43)",
        "(line 140,col 9)-(line 140,col 58)",
        "(line 142,col 9)-(line 144,col 9)",
        "(line 146,col 9)-(line 146,col 24)",
        "(line 147,col 9)-(line 147,col 25)",
        "(line 148,col 9)-(line 148,col 47)",
        "(line 149,col 9)-(line 149,col 46)",
        "(line 150,col 9)-(line 150,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 159,
      "end_line": 180,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 160,col 9)-(line 160,col 15)",
        "(line 162,col 9)-(line 162,col 39)",
        "(line 163,col 9)-(line 163,col 43)",
        "(line 165,col 9)-(line 165,col 26)",
        "(line 166,col 9)-(line 166,col 26)",
        "(line 167,col 9)-(line 167,col 43)",
        "(line 168,col 9)-(line 168,col 65)",
        "(line 169,col 9)-(line 169,col 51)",
        "(line 170,col 9)-(line 170,col 24)",
        "(line 171,col 9)-(line 171,col 25)",
        "(line 172,col 9)-(line 172,col 22)",
        "(line 173,col 9)-(line 173,col 66)",
        "(line 174,col 9)-(line 174,col 45)",
        "(line 175,col 9)-(line 175,col 45)",
        "(line 176,col 9)-(line 176,col 46)",
        "(line 177,col 9)-(line 177,col 26)",
        "(line 178,col 9)-(line 178,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 188,
      "end_line": 191,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 189,col 9)-(line 189,col 19)",
        "(line 190,col 9)-(line 190,col 33)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 199,
      "end_line": 226,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 200,col 9)-(line 200,col 15)",
        "(line 202,col 9)-(line 202,col 25)",
        "(line 204,col 9)-(line 204,col 60)",
        "(line 205,col 9)-(line 205,col 45)",
        "(line 206,col 9)-(line 206,col 47)",
        "(line 208,col 9)-(line 221,col 9)",
        "(line 223,col 9)-(line 223,col 63)",
        "(line 224,col 9)-(line 224,col 26)",
        "(line 225,col 9)-(line 225,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 234,
      "end_line": 237,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     ",
      "child_ranges": [
        "(line 235,col 9)-(line 235,col 15)",
        "(line 236,col 9)-(line 236,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 246,
      "end_line": 248,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 247,col 9)-(line 247,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 257,
      "end_line": 262,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 258,col 9)-(line 260,col 9)",
        "(line 261,col 9)-(line 261,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 269,
      "end_line": 271,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 270,col 9)-(line 270,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 281,
      "end_line": 283,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 282,col 9)-(line 282,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 290,
      "end_line": 292,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 291,col 9)-(line 291,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 299,
      "end_line": 301,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 300,col 9)-(line 300,col 62)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 308,
      "end_line": 310,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 309,col 9)-(line 309,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 317,
      "end_line": 319,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 318,col 9)-(line 318,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 326,
      "end_line": 328,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     ",
      "child_ranges": [
        "(line 327,col 9)-(line 327,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 335,
      "end_line": 337,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 336,col 9)-(line 336,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 344,
      "end_line": 346,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 345,col 9)-(line 345,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 353,
      "end_line": 355,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 354,col 9)-(line 354,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 362,
      "end_line": 364,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 363,col 9)-(line 363,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 399,
      "end_line": 402,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 400,col 9)-(line 400,col 26)",
        "(line 401,col 9)-(line 401,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 410,
      "end_line": 413,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 411,col 9)-(line 411,col 30)",
        "(line 412,col 9)-(line 412,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 421,
      "end_line": 423,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 422,col 9)-(line 422,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 430,
      "end_line": 432,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 466,
      "end_line": 468,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 467,col 9)-(line 467,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 475,
      "end_line": 477,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     ",
      "child_ranges": [
        "(line 476,col 9)-(line 476,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 485,
      "end_line": 488,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 486,col 9)-(line 487,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 495,
      "end_line": 509,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 498,col 9)",
        "(line 500,col 9)-(line 502,col 9)",
        "(line 504,col 9)-(line 506,col 9)",
        "(line 508,col 9)-(line 508,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 517,
      "end_line": 530,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 518,col 9)-(line 520,col 9)",
        "(line 522,col 9)-(line 522,col 38)",
        "(line 523,col 9)-(line 523,col 68)",
        "(line 525,col 9)-(line 527,col 9)",
        "(line 529,col 9)-(line 529,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 537,
      "end_line": 568,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 538,col 9)-(line 538,col 23)",
        "(line 540,col 9)-(line 540,col 70)",
        "(line 541,col 9)-(line 541,col 71)",
        "(line 542,col 9)-(line 542,col 72)",
        "(line 543,col 9)-(line 543,col 73)",
        "(line 544,col 9)-(line 544,col 75)",
        "(line 545,col 9)-(line 545,col 81)",
        "(line 547,col 9)-(line 547,col 30)",
        "(line 549,col 9)-(line 551,col 9)",
        "(line 553,col 9)-(line 553,col 36)",
        "(line 554,col 9)-(line 554,col 74)",
        "(line 555,col 9)-(line 555,col 72)",
        "(line 556,col 9)-(line 556,col 75)",
        "(line 557,col 9)-(line 557,col 76)",
        "(line 558,col 9)-(line 558,col 74)",
        "(line 559,col 9)-(line 559,col 74)",
        "(line 561,col 9)-(line 563,col 9)",
        "(line 565,col 9)-(line 565,col 52)",
        "(line 567,col 9)-(line 567,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 575,
      "end_line": 603,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     ",
      "child_ranges": [
        "(line 576,col 9)-(line 576,col 23)",
        "(line 578,col 9)-(line 578,col 59)",
        "(line 579,col 9)-(line 579,col 26)",
        "(line 580,col 9)-(line 580,col 66)",
        "(line 581,col 9)-(line 581,col 26)",
        "(line 582,col 9)-(line 582,col 67)",
        "(line 583,col 9)-(line 583,col 25)",
        "(line 584,col 9)-(line 584,col 68)",
        "(line 585,col 9)-(line 585,col 25)",
        "(line 586,col 9)-(line 586,col 60)",
        "(line 587,col 9)-(line 587,col 26)",
        "(line 588,col 9)-(line 588,col 66)",
        "(line 589,col 9)-(line 589,col 29)",
        "(line 590,col 9)-(line 590,col 28)",
        "(line 591,col 9)-(line 591,col 36)",
        "(line 592,col 9)-(line 592,col 63)",
        "(line 593,col 9)-(line 593,col 26)",
        "(line 594,col 9)-(line 594,col 61)",
        "(line 595,col 9)-(line 595,col 27)",
        "(line 596,col 9)-(line 596,col 64)",
        "(line 597,col 9)-(line 597,col 27)",
        "(line 598,col 9)-(line 598,col 65)",
        "(line 599,col 9)-(line 599,col 27)",
        "(line 600,col 9)-(line 600,col 69)",
        "(line 601,col 9)-(line 601,col 25)",
        "(line 602,col 9)-(line 602,col 69)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String)",
      "begin_line": 609,
      "end_line": 645,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 610,col 9)-(line 610,col 77)",
        "(line 612,col 9)-(line 634,col 9)",
        "(line 636,col 9)-(line 636,col 61)",
        "(line 641,col 9)-(line 643,col 9)",
        "(line 644,col 9)-(line 644,col 24)"
      ]
    }
  ]
}