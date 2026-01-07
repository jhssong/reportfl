{
  "filepath": "/tmp/Compress-11b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 109,
      "end_line": 918,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 120,
      "end_line": 120,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 123,
      "end_line": 123,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 126,
      "end_line": 126,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 129,
      "end_line": 129,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 132,
      "end_line": 132,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 135,
      "end_line": 135,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 137,
      "end_line": 137,
      "comment": " The version of the format "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 140,
      "end_line": 140,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 143,
      "end_line": 143,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 146,
      "end_line": 146,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 149,
      "end_line": 149,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "isExtended"
      ],
      "begin_line": 152,
      "end_line": 152,
      "comment": " If an extension sparse header follows. "
    },
    {
      "type": "field",
      "varNames": [
        "realSize"
      ],
      "begin_line": 155,
      "end_line": 155,
      "comment": " The entry\u0027s real size in case of a sparse file. "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 158,
      "end_line": 158,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 161,
      "end_line": 161,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 164,
      "end_line": 164,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 167,
      "end_line": 167,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 170,
      "end_line": 170,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 175,
      "end_line": 192,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 176,col 9)-(line 176,col 33)",
        "(line 177,col 9)-(line 177,col 37)",
        "(line 178,col 9)-(line 178,col 23)",
        "(line 179,col 9)-(line 179,col 27)",
        "(line 181,col 9)-(line 181,col 58)",
        "(line 183,col 9)-(line 185,col 9)",
        "(line 187,col 9)-(line 187,col 24)",
        "(line 188,col 9)-(line 188,col 25)",
        "(line 189,col 9)-(line 189,col 29)",
        "(line 190,col 9)-(line 190,col 28)",
        "(line 191,col 9)-(line 191,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 200,
      "end_line": 202,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 201,col 9)-(line 201,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, boolean)",
      "begin_line": 214,
      "end_line": 235,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 215,col 9)-(line 215,col 15)",
        "(line 217,col 9)-(line 217,col 63)",
        "(line 218,col 9)-(line 218,col 43)",
        "(line 220,col 9)-(line 220,col 26)",
        "(line 221,col 9)-(line 221,col 26)",
        "(line 222,col 9)-(line 222,col 25)",
        "(line 223,col 9)-(line 223,col 65)",
        "(line 224,col 9)-(line 224,col 51)",
        "(line 225,col 9)-(line 225,col 24)",
        "(line 226,col 9)-(line 226,col 25)",
        "(line 227,col 9)-(line 227,col 22)",
        "(line 228,col 9)-(line 228,col 66)",
        "(line 229,col 9)-(line 229,col 27)",
        "(line 230,col 9)-(line 230,col 27)",
        "(line 231,col 9)-(line 231,col 28)",
        "(line 232,col 9)-(line 232,col 26)",
        "(line 233,col 9)-(line 233,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 243,
      "end_line": 250,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 244,col 9)-(line 244,col 19)",
        "(line 245,col 9)-(line 245,col 33)",
        "(line 246,col 9)-(line 249,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 259,
      "end_line": 261,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 260,col 9)-(line 260,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 270,
      "end_line": 298,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 271,col 9)-(line 271,col 15)",
        "(line 273,col 9)-(line 273,col 25)",
        "(line 275,col 9)-(line 275,col 27)",
        "(line 277,col 9)-(line 293,col 9)",
        "(line 295,col 9)-(line 295,col 63)",
        "(line 296,col 9)-(line 296,col 26)",
        "(line 297,col 9)-(line 297,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 306,
      "end_line": 309,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     ",
      "child_ranges": [
        "(line 307,col 9)-(line 307,col 15)",
        "(line 308,col 9)-(line 308,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 318,
      "end_line": 320,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 319,col 9)-(line 319,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 329,
      "end_line": 335,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 331,col 9)-(line 333,col 9)",
        "(line 334,col 9)-(line 334,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 342,
      "end_line": 345,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 344,col 9)-(line 344,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 355,
      "end_line": 357,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 364,
      "end_line": 366,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 365,col 9)-(line 365,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 373,
      "end_line": 375,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 374,col 9)-(line 374,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 382,
      "end_line": 384,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 383,col 9)-(line 383,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 391,
      "end_line": 393,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 392,col 9)-(line 392,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setLinkName(java.lang.String)",
      "begin_line": 402,
      "end_line": 404,
      "comment": "\n     * Set this entry\u0027s link name.\n     * \n     * @param link the link name to use.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 403,col 9)-(line 403,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 411,
      "end_line": 413,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 429,
      "end_line": 431,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 430,col 9)-(line 430,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 438,
      "end_line": 440,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 439,col 9)-(line 439,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 447,
      "end_line": 449,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 448,col 9)-(line 448,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 456,
      "end_line": 458,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 457,col 9)-(line 457,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 465,
      "end_line": 467,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 466,col 9)-(line 466,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 474,
      "end_line": 476,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 475,col 9)-(line 475,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 484,
      "end_line": 487,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 485,col 9)-(line 485,col 26)",
        "(line 486,col 9)-(line 486,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 495,
      "end_line": 498,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 496,col 9)-(line 496,col 30)",
        "(line 497,col 9)-(line 497,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 506,
      "end_line": 508,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 507,col 9)-(line 507,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 515,
      "end_line": 517,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 516,col 9)-(line 516,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 524,
      "end_line": 526,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 525,col 9)-(line 525,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate()",
      "begin_line": 529,
      "end_line": 531,
      "comment": " {@inheritDoc} ",
      "child_ranges": [
        "(line 530,col 9)-(line 530,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 538,
      "end_line": 540,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 539,col 9)-(line 539,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 547,
      "end_line": 549,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 548,col 9)-(line 548,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 556,
      "end_line": 558,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 557,col 9)-(line 557,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 566,
      "end_line": 571,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 567,col 9)-(line 569,col 9)",
        "(line 570,col 9)-(line 570,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isExtended()",
      "begin_line": 579,
      "end_line": 581,
      "comment": "\n     * Indicates in case of a sparse file if an extension sparse header\n     * follows.\n     *\n     * @return true if an extension sparse header follows.\n     ",
      "child_ranges": [
        "(line 580,col 9)-(line 580,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getRealSize()",
      "begin_line": 588,
      "end_line": 590,
      "comment": "\n     * Get this entry\u0027s real file size in case of a sparse file.\n     *\n     * @return This entry\u0027s real file size.\n     ",
      "child_ranges": [
        "(line 589,col 9)-(line 589,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNUSparse()",
      "begin_line": 597,
      "end_line": 599,
      "comment": "\n     * Indicate if this entry is a GNU sparse block \n     *\n     * @return true if this is a sparse extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 598,col 9)-(line 598,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 606,
      "end_line": 609,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 607,col 9)-(line 608,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxHeader()",
      "begin_line": 618,
      "end_line": 621,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if this is a Pax header.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 620,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGlobalPaxHeader()",
      "begin_line": 630,
      "end_line": 632,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return \u003ccode\u003etrue\u003c/code\u003e if this is a Pax header.\n     * \n     * @since Apache Commons Compress 1.1\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 639,
      "end_line": 653,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 640,col 9)-(line 642,col 9)",
        "(line 644,col 9)-(line 646,col 9)",
        "(line 648,col 9)-(line 650,col 9)",
        "(line 652,col 9)-(line 652,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile()",
      "begin_line": 660,
      "end_line": 668,
      "comment": "\n     * Check if this is a \"normal file\"\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 661,col 9)-(line 663,col 9)",
        "(line 664,col 9)-(line 666,col 9)",
        "(line 667,col 9)-(line 667,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSymbolicLink()",
      "begin_line": 675,
      "end_line": 677,
      "comment": "\n     * Check if this is a symbolic link entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 676,col 9)-(line 676,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isLink()",
      "begin_line": 684,
      "end_line": 686,
      "comment": "\n     * Check if this is a link entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 685,col 9)-(line 685,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCharacterDevice()",
      "begin_line": 693,
      "end_line": 695,
      "comment": "\n     * Check if this is a character device entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 694,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isBlockDevice()",
      "begin_line": 702,
      "end_line": 704,
      "comment": "\n     * Check if this is a block device entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 703,col 9)-(line 703,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFIFO()",
      "begin_line": 711,
      "end_line": 713,
      "comment": "\n     * Check if this is a FIFO (pipe) entry.\n     *\n     * @since Apache Commons Compress 1.2\n     ",
      "child_ranges": [
        "(line 712,col 9)-(line 712,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 721,
      "end_line": 734,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 722,col 9)-(line 724,col 9)",
        "(line 726,col 9)-(line 726,col 38)",
        "(line 727,col 9)-(line 727,col 68)",
        "(line 729,col 9)-(line 731,col 9)",
        "(line 733,col 9)-(line 733,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 743,
      "end_line": 745,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * \u003cp\u003eThis method does not use the star/GNU tar/BSD tar extensions.\u003c/p\u003e\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 744,col 9)-(line 744,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[], boolean)",
      "begin_line": 755,
      "end_line": 792,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     * @param starMode whether to use the star/GNU tar/BSD tar\n     * extension for the size field if the size is bigger than 8GiB\n     * @since Apache Commons Compress 1.4\n     ",
      "child_ranges": [
        "(line 756,col 9)-(line 756,col 23)",
        "(line 758,col 9)-(line 758,col 73)",
        "(line 759,col 9)-(line 759,col 74)",
        "(line 760,col 9)-(line 760,col 75)",
        "(line 761,col 9)-(line 761,col 76)",
        "(line 762,col 9)-(line 767,col 9)",
        "(line 768,col 9)-(line 768,col 84)",
        "(line 770,col 9)-(line 770,col 30)",
        "(line 772,col 9)-(line 774,col 9)",
        "(line 776,col 9)-(line 776,col 36)",
        "(line 777,col 9)-(line 777,col 77)",
        "(line 778,col 9)-(line 778,col 75)",
        "(line 779,col 9)-(line 779,col 79)",
        "(line 780,col 9)-(line 780,col 78)",
        "(line 781,col 9)-(line 781,col 79)",
        "(line 782,col 9)-(line 782,col 77)",
        "(line 783,col 9)-(line 783,col 77)",
        "(line 785,col 9)-(line 787,col 9)",
        "(line 789,col 9)-(line 789,col 52)",
        "(line 791,col 9)-(line 791,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 799,
      "end_line": 859,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     ",
      "child_ranges": [
        "(line 800,col 9)-(line 800,col 23)",
        "(line 802,col 9)-(line 802,col 59)",
        "(line 803,col 9)-(line 803,col 26)",
        "(line 804,col 9)-(line 804,col 66)",
        "(line 805,col 9)-(line 805,col 26)",
        "(line 806,col 9)-(line 806,col 67)",
        "(line 807,col 9)-(line 807,col 25)",
        "(line 808,col 9)-(line 808,col 68)",
        "(line 809,col 9)-(line 809,col 25)",
        "(line 810,col 9)-(line 810,col 68)",
        "(line 811,col 9)-(line 811,col 26)",
        "(line 812,col 9)-(line 812,col 66)",
        "(line 813,col 9)-(line 813,col 29)",
        "(line 814,col 9)-(line 814,col 28)",
        "(line 815,col 9)-(line 815,col 36)",
        "(line 816,col 9)-(line 816,col 63)",
        "(line 817,col 9)-(line 817,col 26)",
        "(line 818,col 9)-(line 818,col 61)",
        "(line 819,col 9)-(line 819,col 27)",
        "(line 820,col 9)-(line 820,col 65)",
        "(line 821,col 9)-(line 821,col 29)",
        "(line 822,col 9)-(line 822,col 64)",
        "(line 823,col 9)-(line 823,col 27)",
        "(line 824,col 9)-(line 824,col 65)",
        "(line 825,col 9)-(line 825,col 27)",
        "(line 826,col 9)-(line 826,col 69)",
        "(line 827,col 9)-(line 827,col 25)",
        "(line 828,col 9)-(line 828,col 69)",
        "(line 829,col 9)-(line 829,col 25)",
        "(line 831,col 9)-(line 831,col 40)",
        "(line 832,col 9)-(line 858,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String, boolean)",
      "begin_line": 865,
      "end_line": 902,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 867,col 9)-(line 867,col 82)",
        "(line 869,col 9)-(line 891,col 9)",
        "(line 893,col 9)-(line 893,col 61)",
        "(line 898,col 9)-(line 900,col 9)",
        "(line 901,col 9)-(line 901,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType(byte[])",
      "begin_line": 910,
      "end_line": 917,
      "comment": "\n     * Evaluate an entry\u0027s header format from a header buffer.\n     *\n     * @param header The tar entry header buffer to evaluate the format for.\n     * @return format type\n     ",
      "child_ranges": [
        "(line 911,col 9)-(line 911,col 81)",
        "(line 912,col 9)-(line 913,col 33)",
        "(line 914,col 9)-(line 915,col 32)",
        "(line 916,col 9)-(line 916,col 17)"
      ]
    }
  ]
}