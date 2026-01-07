{
  "filepath": "/tmp/Compress-20b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.tar.TarConstants",
        "org.apache.commons.compress.archivers.ArchiveEntry"
      ],
      "begin_line": 116,
      "end_line": 1072,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 121,
      "end_line": 121,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 124,
      "end_line": 124,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 127,
      "end_line": 127,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 130,
      "end_line": 130,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 133,
      "end_line": 133,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "checkSumOK"
      ],
      "begin_line": 136,
      "end_line": 136,
      "comment": " If the header checksum is reasonably correct. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 139,
      "end_line": 139,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 142,
      "end_line": 142,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 145,
      "end_line": 145,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": " The version of the format "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "isExtended"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " If an extension sparse header follows. "
    },
    {
      "type": "field",
      "varNames": [
        "realSize"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " The entry\u0027s real size in case of a sparse file. "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 185,
      "end_line": 194,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 186,col 9)-(line 186,col 58)",
        "(line 188,col 9)-(line 190,col 9)",
        "(line 192,col 9)-(line 192,col 29)",
        "(line 193,col 9)-(line 193,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 202,
      "end_line": 204,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 203,col 9)-(line 203,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, boolean)",
      "begin_line": 216,
      "end_line": 227,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 217,col 9)-(line 217,col 15)",
        "(line 219,col 9)-(line 219,col 63)",
        "(line 220,col 9)-(line 220,col 43)",
        "(line 222,col 9)-(line 222,col 25)",
        "(line 223,col 9)-(line 223,col 65)",
        "(line 224,col 9)-(line 224,col 51)",
        "(line 225,col 9)-(line 225,col 66)",
        "(line 226,col 9)-(line 226,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 235,
      "end_line": 237,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 236,col 9)-(line 236,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte, boolean)",
      "begin_line": 249,
      "end_line": 256,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     * \n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 250,col 9)-(line 250,col 43)",
        "(line 251,col 9)-(line 251,col 33)",
        "(line 252,col 9)-(line 255,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 265,
      "end_line": 267,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 266,col 9)-(line 266,col 61)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 276,
      "end_line": 298,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 277,col 9)-(line 277,col 25)",
        "(line 279,col 9)-(line 294,col 9)",
        "(line 296,col 9)-(line 296,col 63)",
        "(line 297,col 9)-(line 297,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 307,
      "end_line": 310,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 308,col 9)-(line 308,col 15)",
        "(line 309,col 9)-(line 309,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 321,
      "end_line": 325,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @param encoding encoding to use for file names\n     * @since 1.4\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 323,col 9)-(line 323,col 15)",
        "(line 324,col 9)-(line 324,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 334,
      "end_line": 336,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 335,col 9)-(line 335,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 345,
      "end_line": 351,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 347,col 9)-(line 349,col 9)",
        "(line 350,col 9)-(line 350,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 358,
      "end_line": 361,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 360,col 9)-(line 360,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 371,
      "end_line": 373,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 380,
      "end_line": 382,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 381,col 9)-(line 381,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 389,
      "end_line": 391,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 390,col 9)-(line 390,col 51)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 398,
      "end_line": 400,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 399,col 9)-(line 399,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 407,
      "end_line": 409,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 408,col 9)-(line 408,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setLinkName(java.lang.String)",
      "begin_line": 418,
      "end_line": 420,
      "comment": "\n     * Set this entry\u0027s link name.\n     * \n     * @param link the link name to use.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 419,col 9)-(line 419,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 427,
      "end_line": 429,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     ",
      "child_ranges": [
        "(line 428,col 9)-(line 428,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 436,
      "end_line": 438,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 437,col 9)-(line 437,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 445,
      "end_line": 447,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 446,col 9)-(line 446,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 454,
      "end_line": 456,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 455,col 9)-(line 455,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 463,
      "end_line": 465,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 464,col 9)-(line 464,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 472,
      "end_line": 474,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 473,col 9)-(line 473,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 481,
      "end_line": 483,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 482,col 9)-(line 482,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 490,
      "end_line": 492,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 491,col 9)-(line 491,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 500,
      "end_line": 503,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 501,col 9)-(line 501,col 26)",
        "(line 502,col 9)-(line 502,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 511,
      "end_line": 514,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 30)",
        "(line 513,col 9)-(line 513,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 522,
      "end_line": 524,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 523,col 9)-(line 523,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 531,
      "end_line": 533,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate()",
      "begin_line": 544,
      "end_line": 546,
      "comment": "",
      "child_ranges": [
        "(line 545,col 9)-(line 545,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCheckSumOK()",
      "begin_line": 555,
      "end_line": 557,
      "comment": "\n     * Get this entry\u0027s checksum status.\n     *\n     * @return if the header checksum is reasonably correct\n     * @see TarUtils#verifyCheckSum(byte[])\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 556,col 9)-(line 556,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 564,
      "end_line": 566,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 565,col 9)-(line 565,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 573,
      "end_line": 575,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 574,col 9)-(line 574,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 582,
      "end_line": 584,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 583,col 9)-(line 583,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 592,
      "end_line": 597,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 593,col 9)-(line 595,col 9)",
        "(line 596,col 9)-(line 596,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMajor()",
      "begin_line": 605,
      "end_line": 607,
      "comment": "\n     * Get this entry\u0027s major device number.\n     *\n     * @return This entry\u0027s major device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 606,col 9)-(line 606,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMajor(int)",
      "begin_line": 616,
      "end_line": 622,
      "comment": "\n     * Set this entry\u0027s major device number.\n     *\n     * @param devNo This entry\u0027s major device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 617,col 9)-(line 620,col 9)",
        "(line 621,col 9)-(line 621,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMinor()",
      "begin_line": 630,
      "end_line": 632,
      "comment": "\n     * Get this entry\u0027s minor device number.\n     *\n     * @return This entry\u0027s minor device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 631,col 9)-(line 631,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMinor(int)",
      "begin_line": 641,
      "end_line": 647,
      "comment": "\n     * Set this entry\u0027s minor device number.\n     *\n     * @param devNo This entry\u0027s minor device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 642,col 9)-(line 645,col 9)",
        "(line 646,col 9)-(line 646,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isExtended()",
      "begin_line": 655,
      "end_line": 657,
      "comment": "\n     * Indicates in case of a sparse file if an extension sparse header\n     * follows.\n     *\n     * @return true if an extension sparse header follows.\n     ",
      "child_ranges": [
        "(line 656,col 9)-(line 656,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getRealSize()",
      "begin_line": 664,
      "end_line": 666,
      "comment": "\n     * Get this entry\u0027s real file size in case of a sparse file.\n     *\n     * @return This entry\u0027s real file size.\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNUSparse()",
      "begin_line": 673,
      "end_line": 675,
      "comment": "\n     * Indicate if this entry is a GNU sparse block \n     *\n     * @return true if this is a sparse extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongLinkEntry()",
      "begin_line": 682,
      "end_line": 685,
      "comment": "\n     * Indicate if this entry is a GNU long linkname block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 683,col 9)-(line 684,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 692,
      "end_line": 695,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 693,col 9)-(line 694,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxHeader()",
      "begin_line": 705,
      "end_line": 708,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return {@code true} if this is a Pax header.\n     * \n     * @since 1.1\n     * \n     ",
      "child_ranges": [
        "(line 706,col 9)-(line 707,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGlobalPaxHeader()",
      "begin_line": 717,
      "end_line": 719,
      "comment": "\n     * Check if this is a Pax header.\n     * \n     * @return {@code true} if this is a Pax header.\n     * \n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 718,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 726,
      "end_line": 740,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 727,col 9)-(line 729,col 9)",
        "(line 731,col 9)-(line 733,col 9)",
        "(line 735,col 9)-(line 737,col 9)",
        "(line 739,col 9)-(line 739,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile()",
      "begin_line": 747,
      "end_line": 755,
      "comment": "\n     * Check if this is a \"normal file\"\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 748,col 9)-(line 750,col 9)",
        "(line 751,col 9)-(line 753,col 9)",
        "(line 754,col 9)-(line 754,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSymbolicLink()",
      "begin_line": 762,
      "end_line": 764,
      "comment": "\n     * Check if this is a symbolic link entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 763,col 9)-(line 763,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isLink()",
      "begin_line": 771,
      "end_line": 773,
      "comment": "\n     * Check if this is a link entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 772,col 9)-(line 772,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCharacterDevice()",
      "begin_line": 780,
      "end_line": 782,
      "comment": "\n     * Check if this is a character device entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 781,col 9)-(line 781,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isBlockDevice()",
      "begin_line": 789,
      "end_line": 791,
      "comment": "\n     * Check if this is a block device entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 790,col 9)-(line 790,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFIFO()",
      "begin_line": 798,
      "end_line": 800,
      "comment": "\n     * Check if this is a FIFO (pipe) entry.\n     *\n     * @since 1.2\n     ",
      "child_ranges": [
        "(line 799,col 9)-(line 799,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 808,
      "end_line": 821,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 809,col 9)-(line 811,col 9)",
        "(line 813,col 9)-(line 813,col 38)",
        "(line 814,col 9)-(line 814,col 68)",
        "(line 816,col 9)-(line 818,col 9)",
        "(line 820,col 9)-(line 820,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 830,
      "end_line": 841,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * \u003cp\u003eThis method does not use the star/GNU tar/BSD tar extensions.\u003c/p\u003e\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 831,col 9)-(line 840,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 853,
      "end_line": 895,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     * @param encoding encoding to use when writing the file name.\n     * @param starMode whether to use the star/GNU tar/BSD tar\n     * extension for numeric fields if their value doesn\u0027t fit in the\n     * maximum size of standard tar archives\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 855,col 9)-(line 855,col 23)",
        "(line 857,col 9)-(line 858,col 52)",
        "(line 859,col 9)-(line 859,col 80)",
        "(line 860,col 9)-(line 861,col 49)",
        "(line 862,col 9)-(line 863,col 49)",
        "(line 864,col 9)-(line 864,col 80)",
        "(line 865,col 9)-(line 866,col 49)",
        "(line 868,col 9)-(line 868,col 30)",
        "(line 870,col 9)-(line 872,col 9)",
        "(line 874,col 9)-(line 874,col 36)",
        "(line 875,col 9)-(line 876,col 52)",
        "(line 877,col 9)-(line 877,col 75)",
        "(line 878,col 9)-(line 878,col 79)",
        "(line 879,col 9)-(line 880,col 52)",
        "(line 881,col 9)-(line 882,col 52)",
        "(line 883,col 9)-(line 884,col 49)",
        "(line 885,col 9)-(line 886,col 49)",
        "(line 888,col 9)-(line 890,col 9)",
        "(line 892,col 9)-(line 892,col 52)",
        "(line 894,col 9)-(line 894,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(long, byte[], int, int, boolean)",
      "begin_line": 897,
      "end_line": 908,
      "comment": "",
      "child_ranges": [
        "(line 899,col 9)-(line 905,col 9)",
        "(line 906,col 9)-(line 907,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 916,
      "end_line": 927,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 926,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 938,
      "end_line": 941,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @param encoding encoding to use for file names\n     * @since 1.4\n     * @throws IllegalArgumentException if any of the numeric fields\n     * have an invalid format\n     ",
      "child_ranges": [
        "(line 940,col 9)-(line 940,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 943,
      "end_line": 1012,
      "comment": "",
      "child_ranges": [
        "(line 946,col 9)-(line 946,col 23)",
        "(line 948,col 9)-(line 949,col 68)",
        "(line 950,col 9)-(line 950,col 26)",
        "(line 951,col 9)-(line 951,col 74)",
        "(line 952,col 9)-(line 952,col 26)",
        "(line 953,col 9)-(line 953,col 75)",
        "(line 954,col 9)-(line 954,col 25)",
        "(line 955,col 9)-(line 955,col 76)",
        "(line 956,col 9)-(line 956,col 25)",
        "(line 957,col 9)-(line 957,col 68)",
        "(line 958,col 9)-(line 958,col 26)",
        "(line 959,col 9)-(line 959,col 74)",
        "(line 960,col 9)-(line 960,col 29)",
        "(line 961,col 9)-(line 961,col 53)",
        "(line 962,col 9)-(line 962,col 28)",
        "(line 963,col 9)-(line 963,col 36)",
        "(line 964,col 9)-(line 965,col 68)",
        "(line 966,col 9)-(line 966,col 26)",
        "(line 967,col 9)-(line 967,col 61)",
        "(line 968,col 9)-(line 968,col 27)",
        "(line 969,col 9)-(line 969,col 65)",
        "(line 970,col 9)-(line 970,col 29)",
        "(line 971,col 9)-(line 972,col 69)",
        "(line 973,col 9)-(line 973,col 27)",
        "(line 974,col 9)-(line 975,col 69)",
        "(line 976,col 9)-(line 976,col 27)",
        "(line 977,col 9)-(line 977,col 77)",
        "(line 978,col 9)-(line 978,col 25)",
        "(line 979,col 9)-(line 979,col 77)",
        "(line 980,col 9)-(line 980,col 25)",
        "(line 982,col 9)-(line 982,col 40)",
        "(line 983,col 9)-(line 1011,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String, boolean)",
      "begin_line": 1018,
      "end_line": 1055,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 1020,col 9)-(line 1020,col 82)",
        "(line 1022,col 9)-(line 1044,col 9)",
        "(line 1046,col 9)-(line 1046,col 61)",
        "(line 1051,col 9)-(line 1053,col 9)",
        "(line 1054,col 9)-(line 1054,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType(byte[])",
      "begin_line": 1063,
      "end_line": 1071,
      "comment": "\n     * Evaluate an entry\u0027s header format from a header buffer.\n     *\n     * @param header The tar entry header buffer to evaluate the format for.\n     * @return format type\n     ",
      "child_ranges": [
        "(line 1064,col 9)-(line 1066,col 9)",
        "(line 1067,col 9)-(line 1069,col 9)",
        "(line 1070,col 9)-(line 1070,col 17)"
      ]
    }
  ]
}