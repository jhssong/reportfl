{
  "filepath": "/tmp/Compress-46b/src/main/java/org/apache/commons/compress/archivers/tar/TarArchiveEntry.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "TarArchiveEntry",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.ArchiveEntry",
        "org.apache.commons.compress.archivers.tar.TarConstants"
      ],
      "begin_line": 146,
      "end_line": 1404,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "EMPTY_TAR_ARCHIVE_ENTRIES"
      ],
      "begin_line": 147,
      "end_line": 147,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "name"
      ],
      "begin_line": 150,
      "end_line": 150,
      "comment": " The entry\u0027s name. "
    },
    {
      "type": "field",
      "varNames": [
        "preserveLeadingSlashes"
      ],
      "begin_line": 153,
      "end_line": 153,
      "comment": " Whether to enforce leading slashes on the name "
    },
    {
      "type": "field",
      "varNames": [
        "mode"
      ],
      "begin_line": 156,
      "end_line": 156,
      "comment": " The entry\u0027s permission mode. "
    },
    {
      "type": "field",
      "varNames": [
        "userId"
      ],
      "begin_line": 159,
      "end_line": 159,
      "comment": " The entry\u0027s user id. "
    },
    {
      "type": "field",
      "varNames": [
        "groupId"
      ],
      "begin_line": 162,
      "end_line": 162,
      "comment": " The entry\u0027s group id. "
    },
    {
      "type": "field",
      "varNames": [
        "size"
      ],
      "begin_line": 165,
      "end_line": 165,
      "comment": " The entry\u0027s size. "
    },
    {
      "type": "field",
      "varNames": [
        "modTime"
      ],
      "begin_line": 168,
      "end_line": 168,
      "comment": " The entry\u0027s modification time. "
    },
    {
      "type": "field",
      "varNames": [
        "checkSumOK"
      ],
      "begin_line": 171,
      "end_line": 171,
      "comment": " If the header checksum is reasonably correct. "
    },
    {
      "type": "field",
      "varNames": [
        "linkFlag"
      ],
      "begin_line": 174,
      "end_line": 174,
      "comment": " The entry\u0027s link flag. "
    },
    {
      "type": "field",
      "varNames": [
        "linkName"
      ],
      "begin_line": 177,
      "end_line": 177,
      "comment": " The entry\u0027s link name. "
    },
    {
      "type": "field",
      "varNames": [
        "magic"
      ],
      "begin_line": 180,
      "end_line": 180,
      "comment": " The entry\u0027s magic tag. "
    },
    {
      "type": "field",
      "varNames": [
        "version"
      ],
      "begin_line": 182,
      "end_line": 182,
      "comment": " The version of the format "
    },
    {
      "type": "field",
      "varNames": [
        "userName"
      ],
      "begin_line": 185,
      "end_line": 185,
      "comment": " The entry\u0027s user name. "
    },
    {
      "type": "field",
      "varNames": [
        "groupName"
      ],
      "begin_line": 188,
      "end_line": 188,
      "comment": " The entry\u0027s group name. "
    },
    {
      "type": "field",
      "varNames": [
        "devMajor"
      ],
      "begin_line": 191,
      "end_line": 191,
      "comment": " The entry\u0027s major device number. "
    },
    {
      "type": "field",
      "varNames": [
        "devMinor"
      ],
      "begin_line": 194,
      "end_line": 194,
      "comment": " The entry\u0027s minor device number. "
    },
    {
      "type": "field",
      "varNames": [
        "isExtended"
      ],
      "begin_line": 197,
      "end_line": 197,
      "comment": " If an extension sparse header follows. "
    },
    {
      "type": "field",
      "varNames": [
        "realSize"
      ],
      "begin_line": 200,
      "end_line": 200,
      "comment": " The entry\u0027s real size in case of a sparse file. "
    },
    {
      "type": "field",
      "varNames": [
        "paxGNUSparse"
      ],
      "begin_line": 203,
      "end_line": 203,
      "comment": " is this entry a GNU sparse entry using one of the PAX formats? "
    },
    {
      "type": "field",
      "varNames": [
        "starSparse"
      ],
      "begin_line": 206,
      "end_line": 206,
      "comment": " is this entry a star sparse entry using the PAX header? "
    },
    {
      "type": "field",
      "varNames": [
        "file"
      ],
      "begin_line": 209,
      "end_line": 209,
      "comment": " The entry\u0027s file reference "
    },
    {
      "type": "field",
      "varNames": [
        "extraPaxHeaders"
      ],
      "begin_line": 212,
      "end_line": 212,
      "comment": " Extra, user supplied pax headers     "
    },
    {
      "type": "field",
      "varNames": [
        "MAX_NAMELEN"
      ],
      "begin_line": 215,
      "end_line": 215,
      "comment": " Maximum length of a user\u0027s name in the tar file "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_DIR_MODE"
      ],
      "begin_line": 218,
      "end_line": 218,
      "comment": " Default permissions bits for directories "
    },
    {
      "type": "field",
      "varNames": [
        "DEFAULT_FILE_MODE"
      ],
      "begin_line": 221,
      "end_line": 221,
      "comment": " Default permissions bits for files "
    },
    {
      "type": "field",
      "varNames": [
        "MILLIS_PER_SECOND"
      ],
      "begin_line": 224,
      "end_line": 224,
      "comment": " Convert millis to seconds "
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry()",
      "begin_line": 230,
      "end_line": 239,
      "comment": "\n     * Construct an empty entry and prepares the header values.\n     ",
      "child_ranges": [
        "(line 231,col 9)-(line 231,col 58)",
        "(line 233,col 9)-(line 235,col 9)",
        "(line 237,col 9)-(line 237,col 29)",
        "(line 238,col 9)-(line 238,col 25)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String)",
      "begin_line": 247,
      "end_line": 249,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     ",
      "child_ranges": [
        "(line 248,col 9)-(line 248,col 26)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, boolean)",
      "begin_line": 261,
      "end_line": 274,
      "comment": "\n     * Construct an entry with only a name. This allows the programmer\n     * to construct the entry\u0027s header \"by hand\". File is set to null.\n     *\n     * @param name the entry name\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 262,col 9)-(line 262,col 15)",
        "(line 264,col 9)-(line 264,col 61)",
        "(line 266,col 9)-(line 266,col 63)",
        "(line 267,col 9)-(line 267,col 49)",
        "(line 269,col 9)-(line 269,col 25)",
        "(line 270,col 9)-(line 270,col 65)",
        "(line 271,col 9)-(line 271,col 51)",
        "(line 272,col 9)-(line 272,col 64)",
        "(line 273,col 9)-(line 273,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte)",
      "begin_line": 282,
      "end_line": 284,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     ",
      "child_ranges": [
        "(line 283,col 9)-(line 283,col 36)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.lang.String, byte, boolean)",
      "begin_line": 296,
      "end_line": 303,
      "comment": "\n     * Construct an entry with a name and a link flag.\n     *\n     * @param name the entry name\n     * @param linkFlag the entry link flag.\n     * @param preserveLeadingSlashes whether to allow leading slashes\n     * in the name.\n     *\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 297,col 9)-(line 297,col 43)",
        "(line 298,col 9)-(line 298,col 33)",
        "(line 299,col 9)-(line 302,col 9)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File)",
      "begin_line": 312,
      "end_line": 314,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     * The name is set from the normalized file path.\n     *\n     * @param file The file that the entry represents.\n     ",
      "child_ranges": [
        "(line 313,col 9)-(line 313,col 35)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(java.io.File, java.lang.String)",
      "begin_line": 323,
      "end_line": 346,
      "comment": "\n     * Construct an entry for a file. File is set to file, and the\n     * header is constructed from information from the file.\n     *\n     * @param file The file that the entry represents.\n     * @param fileName the name to be used for the entry.\n     ",
      "child_ranges": [
        "(line 324,col 9)-(line 324,col 73)",
        "(line 325,col 9)-(line 325,col 25)",
        "(line 327,col 9)-(line 342,col 9)",
        "(line 344,col 9)-(line 344,col 63)",
        "(line 345,col 9)-(line 345,col 27)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[])",
      "begin_line": 355,
      "end_line": 358,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 356,col 9)-(line 356,col 15)",
        "(line 357,col 9)-(line 357,col 34)"
      ]
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.TarArchiveEntry(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 370,
      "end_line": 374,
      "comment": "\n     * Construct an entry from an archive\u0027s header bytes. File is set\n     * to null.\n     *\n     * @param headerBuf The header bytes from a tar archive entry.\n     * @param encoding encoding to use for file names\n     * @since 1.4\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 372,col 9)-(line 372,col 15)",
        "(line 373,col 9)-(line 373,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 383,
      "end_line": 385,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 384,col 9)-(line 384,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.equals(java.lang.Object)",
      "begin_line": 394,
      "end_line": 400,
      "comment": "\n     * Determine if the two entries are equal. Equality is determined\n     * by the header names being equal.\n     *\n     * @param it Entry to be checked for equality.\n     * @return True if the entries are equal.\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 398,col 9)",
        "(line 399,col 9)-(line 399,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.hashCode()",
      "begin_line": 407,
      "end_line": 410,
      "comment": "\n     * Hashcodes are based on entry names.\n     *\n     * @return the entry hashcode\n     ",
      "child_ranges": [
        "(line 409,col 9)-(line 409,col 36)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDescendent(org.apache.commons.compress.archivers.tar.TarArchiveEntry)",
      "begin_line": 420,
      "end_line": 422,
      "comment": "\n     * Determine if the given entry is a descendant of this entry.\n     * Descendancy is determined by the name of the descendant\n     * starting with this entry\u0027s name.\n     *\n     * @param desc Entry to be checked as a descendent of this.\n     * @return True if entry is a descendant of this.\n     ",
      "child_ranges": [
        "(line 421,col 9)-(line 421,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getName()",
      "begin_line": 429,
      "end_line": 432,
      "comment": "\n     * Get this entry\u0027s name.\n     *\n     * @return This entry\u0027s name.\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setName(java.lang.String)",
      "begin_line": 439,
      "end_line": 441,
      "comment": "\n     * Set this entry\u0027s name.\n     *\n     * @param name This entry\u0027s new name.\n     ",
      "child_ranges": [
        "(line 440,col 9)-(line 440,col 73)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setMode(int)",
      "begin_line": 448,
      "end_line": 450,
      "comment": "\n     * Set the mode for this entry\n     *\n     * @param mode the mode for this entry\n     ",
      "child_ranges": [
        "(line 449,col 9)-(line 449,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLinkName()",
      "begin_line": 457,
      "end_line": 459,
      "comment": "\n     * Get this entry\u0027s link name.\n     *\n     * @return This entry\u0027s link name.\n     ",
      "child_ranges": [
        "(line 458,col 9)-(line 458,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setLinkName(java.lang.String)",
      "begin_line": 468,
      "end_line": 470,
      "comment": "\n     * Set this entry\u0027s link name.\n     *\n     * @param link the link name to use.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 469,col 9)-(line 469,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserId()",
      "begin_line": 479,
      "end_line": 482,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     * @deprecated use #getLongUserId instead as user ids can be\n     * bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 481,col 9)-(line 481,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(int)",
      "begin_line": 489,
      "end_line": 491,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     ",
      "child_ranges": [
        "(line 490,col 9)-(line 490,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLongUserId()",
      "begin_line": 499,
      "end_line": 501,
      "comment": "\n     * Get this entry\u0027s user id.\n     *\n     * @return This entry\u0027s user id.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 500,col 9)-(line 500,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserId(long)",
      "begin_line": 509,
      "end_line": 511,
      "comment": "\n     * Set this entry\u0027s user id.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @since 1.10\n     ",
      "child_ranges": [
        "(line 510,col 9)-(line 510,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupId()",
      "begin_line": 520,
      "end_line": 523,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @return This entry\u0027s group id.\n     * @deprecated use #getLongGroupId instead as group ids can be\n     * bigger than {@link Integer#MAX_VALUE}\n     ",
      "child_ranges": [
        "(line 522,col 9)-(line 522,col 44)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(int)",
      "begin_line": 530,
      "end_line": 532,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLongGroupId()",
      "begin_line": 540,
      "end_line": 542,
      "comment": "\n     * Get this entry\u0027s group id.\n     *\n     * @since 1.10\n     * @return This entry\u0027s group id.\n     ",
      "child_ranges": [
        "(line 541,col 9)-(line 541,col 23)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupId(long)",
      "begin_line": 550,
      "end_line": 552,
      "comment": "\n     * Set this entry\u0027s group id.\n     *\n     * @since 1.10\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getUserName()",
      "begin_line": 559,
      "end_line": 561,
      "comment": "\n     * Get this entry\u0027s user name.\n     *\n     * @return This entry\u0027s user name.\n     ",
      "child_ranges": [
        "(line 560,col 9)-(line 560,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setUserName(java.lang.String)",
      "begin_line": 568,
      "end_line": 570,
      "comment": "\n     * Set this entry\u0027s user name.\n     *\n     * @param userName This entry\u0027s new user name.\n     ",
      "child_ranges": [
        "(line 569,col 9)-(line 569,col 33)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getGroupName()",
      "begin_line": 577,
      "end_line": 579,
      "comment": "\n     * Get this entry\u0027s group name.\n     *\n     * @return This entry\u0027s group name.\n     ",
      "child_ranges": [
        "(line 578,col 9)-(line 578,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setGroupName(java.lang.String)",
      "begin_line": 586,
      "end_line": 588,
      "comment": "\n     * Set this entry\u0027s group name.\n     *\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 587,col 9)-(line 587,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setIds(int, int)",
      "begin_line": 596,
      "end_line": 599,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user ids.\n     *\n     * @param userId This entry\u0027s new user id.\n     * @param groupId This entry\u0027s new group id.\n     ",
      "child_ranges": [
        "(line 597,col 9)-(line 597,col 26)",
        "(line 598,col 9)-(line 598,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setNames(java.lang.String, java.lang.String)",
      "begin_line": 607,
      "end_line": 610,
      "comment": "\n     * Convenience method to set this entry\u0027s group and user names.\n     *\n     * @param userName This entry\u0027s new user name.\n     * @param groupName This entry\u0027s new group name.\n     ",
      "child_ranges": [
        "(line 608,col 9)-(line 608,col 30)",
        "(line 609,col 9)-(line 609,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(long)",
      "begin_line": 618,
      "end_line": 620,
      "comment": "\n     * Set this entry\u0027s modification time. The parameter passed\n     * to this method is in \"Java time\".\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 619,col 9)-(line 619,col 43)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setModTime(java.util.Date)",
      "begin_line": 627,
      "end_line": 629,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @param time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 628,col 9)-(line 628,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getModTime()",
      "begin_line": 636,
      "end_line": 638,
      "comment": "\n     * Set this entry\u0027s modification time.\n     *\n     * @return time This entry\u0027s new modification time.\n     ",
      "child_ranges": [
        "(line 637,col 9)-(line 637,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getLastModifiedDate()",
      "begin_line": 640,
      "end_line": 643,
      "comment": "",
      "child_ranges": [
        "(line 642,col 9)-(line 642,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCheckSumOK()",
      "begin_line": 652,
      "end_line": 654,
      "comment": "\n     * Get this entry\u0027s checksum status.\n     *\n     * @return if the header checksum is reasonably correct\n     * @see TarUtils#verifyCheckSum(byte[])\n     * @since 1.5\n     ",
      "child_ranges": [
        "(line 653,col 9)-(line 653,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getFile()",
      "begin_line": 664,
      "end_line": 666,
      "comment": "\n     * Get this entry\u0027s file.\n     *\n     * \u003cp\u003eThis method is only useful for entries created from a {@code\n     * File} but not for entries read from an archive.\u003c/p\u003e\n     *\n     * @return This entry\u0027s file.\n     ",
      "child_ranges": [
        "(line 665,col 9)-(line 665,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getMode()",
      "begin_line": 673,
      "end_line": 675,
      "comment": "\n     * Get this entry\u0027s mode.\n     *\n     * @return This entry\u0027s mode.\n     ",
      "child_ranges": [
        "(line 674,col 9)-(line 674,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getSize()",
      "begin_line": 682,
      "end_line": 685,
      "comment": "\n     * Get this entry\u0027s file size.\n     *\n     * @return This entry\u0027s file size.\n     ",
      "child_ranges": [
        "(line 684,col 9)-(line 684,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setSize(long)",
      "begin_line": 693,
      "end_line": 698,
      "comment": "\n     * Set this entry\u0027s file size.\n     *\n     * @param size This entry\u0027s new file size.\n     * @throws IllegalArgumentException if the size is \u0026lt; 0.\n     ",
      "child_ranges": [
        "(line 694,col 9)-(line 696,col 9)",
        "(line 697,col 9)-(line 697,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMajor()",
      "begin_line": 706,
      "end_line": 708,
      "comment": "\n     * Get this entry\u0027s major device number.\n     *\n     * @return This entry\u0027s major device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 707,col 9)-(line 707,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMajor(int)",
      "begin_line": 717,
      "end_line": 723,
      "comment": "\n     * Set this entry\u0027s major device number.\n     *\n     * @param devNo This entry\u0027s major device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 718,col 9)-(line 721,col 9)",
        "(line 722,col 9)-(line 722,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDevMinor()",
      "begin_line": 731,
      "end_line": 733,
      "comment": "\n     * Get this entry\u0027s minor device number.\n     *\n     * @return This entry\u0027s minor device number.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 732,col 9)-(line 732,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.setDevMinor(int)",
      "begin_line": 742,
      "end_line": 748,
      "comment": "\n     * Set this entry\u0027s minor device number.\n     *\n     * @param devNo This entry\u0027s minor device number.\n     * @throws IllegalArgumentException if the devNo is \u0026lt; 0.\n     * @since 1.4\n     ",
      "child_ranges": [
        "(line 743,col 9)-(line 746,col 9)",
        "(line 747,col 9)-(line 747,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isExtended()",
      "begin_line": 756,
      "end_line": 758,
      "comment": "\n     * Indicates in case of an oldgnu sparse file if an extension\n     * sparse header follows.\n     *\n     * @return true if an extension oldgnu sparse header follows.\n     ",
      "child_ranges": [
        "(line 757,col 9)-(line 757,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getRealSize()",
      "begin_line": 765,
      "end_line": 767,
      "comment": "\n     * Get this entry\u0027s real file size in case of a sparse file.\n     *\n     * @return This entry\u0027s real file size.\n     ",
      "child_ranges": [
        "(line 766,col 9)-(line 766,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNUSparse()",
      "begin_line": 774,
      "end_line": 776,
      "comment": "\n     * Indicate if this entry is a GNU sparse block.\n     *\n     * @return true if this is a sparse extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 775,col 9)-(line 775,col 52)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isOldGNUSparse()",
      "begin_line": 785,
      "end_line": 787,
      "comment": "\n     * Indicate if this entry is a GNU or star sparse block using the\n     * oldgnu format.\n     *\n     * @return true if this is a sparse extension provided by GNU tar or star\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 786,col 9)-(line 786,col 45)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxGNUSparse()",
      "begin_line": 796,
      "end_line": 798,
      "comment": "\n     * Indicate if this entry is a GNU sparse block using one of the\n     * PAX formats.\n     *\n     * @return true if this is a sparse extension provided by GNU tar\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 797,col 9)-(line 797,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isStarSparse()",
      "begin_line": 806,
      "end_line": 808,
      "comment": "\n     * Indicate if this entry is a star sparse block using PAX headers.\n     *\n     * @return true if this is a sparse extension provided by star\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 807,col 9)-(line 807,col 26)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongLinkEntry()",
      "begin_line": 815,
      "end_line": 817,
      "comment": "\n     * Indicate if this entry is a GNU long linkname block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 816,col 9)-(line 816,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGNULongNameEntry()",
      "begin_line": 824,
      "end_line": 826,
      "comment": "\n     * Indicate if this entry is a GNU long name block\n     *\n     * @return true if this is a long name extension provided by GNU tar\n     ",
      "child_ranges": [
        "(line 825,col 9)-(line 825,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isPaxHeader()",
      "begin_line": 836,
      "end_line": 839,
      "comment": "\n     * Check if this is a Pax header.\n     *\n     * @return {@code true} if this is a Pax header.\n     *\n     * @since 1.1\n     *\n     ",
      "child_ranges": [
        "(line 837,col 9)-(line 838,col 53)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isGlobalPaxHeader()",
      "begin_line": 848,
      "end_line": 850,
      "comment": "\n     * Check if this is a Pax header.\n     *\n     * @return {@code true} if this is a Pax header.\n     *\n     * @since 1.1\n     ",
      "child_ranges": [
        "(line 849,col 9)-(line 849,col 57)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isDirectory()",
      "begin_line": 857,
      "end_line": 872,
      "comment": "\n     * Return whether or not this entry represents a directory.\n     *\n     * @return True if this entry is a directory.\n     ",
      "child_ranges": [
        "(line 859,col 9)-(line 861,col 9)",
        "(line 863,col 9)-(line 865,col 9)",
        "(line 867,col 9)-(line 869,col 9)",
        "(line 871,col 9)-(line 871,col 21)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFile()",
      "begin_line": 880,
      "end_line": 888,
      "comment": "\n     * Check if this is a \"normal file\"\n     *\n     * @since 1.2\n     * @return whether this is a \"normal file\"\n     ",
      "child_ranges": [
        "(line 881,col 9)-(line 883,col 9)",
        "(line 884,col 9)-(line 886,col 9)",
        "(line 887,col 9)-(line 887,col 40)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSymbolicLink()",
      "begin_line": 896,
      "end_line": 898,
      "comment": "\n     * Check if this is a symbolic link entry.\n     *\n     * @since 1.2\n     * @return whether this is a symbolic link\n     ",
      "child_ranges": [
        "(line 897,col 9)-(line 897,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isLink()",
      "begin_line": 906,
      "end_line": 908,
      "comment": "\n     * Check if this is a link entry.\n     *\n     * @since 1.2\n     * @return whether this is a link entry\n     ",
      "child_ranges": [
        "(line 907,col 9)-(line 907,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isCharacterDevice()",
      "begin_line": 916,
      "end_line": 918,
      "comment": "\n     * Check if this is a character device entry.\n     *\n     * @since 1.2\n     * @return whether this is a character device\n     ",
      "child_ranges": [
        "(line 917,col 9)-(line 917,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isBlockDevice()",
      "begin_line": 926,
      "end_line": 928,
      "comment": "\n     * Check if this is a block device entry.\n     *\n     * @since 1.2\n     * @return whether this is a block device\n     ",
      "child_ranges": [
        "(line 927,col 9)-(line 927,col 34)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isFIFO()",
      "begin_line": 936,
      "end_line": 938,
      "comment": "\n     * Check if this is a FIFO (pipe) entry.\n     *\n     * @since 1.2\n     * @return whether this is a FIFO entry\n     ",
      "child_ranges": [
        "(line 937,col 9)-(line 937,col 35)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.isSparse()",
      "begin_line": 946,
      "end_line": 948,
      "comment": "\n     * Check whether this is a sparse entry.\n     *\n     * @return whether this is a sparse entry\n     * @since 1.11\n     ",
      "child_ranges": [
        "(line 947,col 9)-(line 947,col 47)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getExtraPaxHeaders()",
      "begin_line": 955,
      "end_line": 957,
      "comment": "\n     * get extra PAX Headers\n     * @return read-only map containing any extra PAX Headers\n     * @since 1.15\n     ",
      "child_ranges": [
        "(line 956,col 9)-(line 956,col 60)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.clearExtraPaxHeaders()",
      "begin_line": 963,
      "end_line": 965,
      "comment": "\n     * clear all extra PAX headers.\n     * @since 1.15\n     ",
      "child_ranges": [
        "(line 964,col 9)-(line 964,col 32)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.addPaxHeader(java.lang.String, java.lang.String)",
      "begin_line": 974,
      "end_line": 976,
      "comment": "\n     * add a PAX header to this entry. If the header corresponds to an existing field in the entry,\n     * that field will be set; otherwise the header will be added to the extraPaxHeaders Map\n     * @param name  The full name of the header to set.\n     * @param value value of header.\n     * @since 1.15\n     ",
      "child_ranges": [
        "(line 975,col 10)-(line 975,col 38)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getExtraPaxHeader(java.lang.String)",
      "begin_line": 984,
      "end_line": 986,
      "comment": "\n     * get named extra PAX header\n     * @param name The full name of an extended PAX header to retrieve\n     * @return The value of the header, if any.\n     * @since 1.15\n     ",
      "child_ranges": [
        "(line 985,col 9)-(line 985,col 41)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.updateEntryFromPaxHeaders(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 993,
      "end_line": 999,
      "comment": "\n     * Update the entry using a map of pax headers.\n     * @param headers\n     * @since 1.15\n     ",
      "child_ranges": [
        "(line 994,col 9)-(line 998,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.processPaxHeader(java.lang.String, java.lang.String)",
      "begin_line": 1008,
      "end_line": 1010,
      "comment": "\n     * process one pax header, using the entries extraPaxHeaders map as source for extra headers\n     * used when handling entries for sparse files.\n     * @param key\n     * @param val\n     * @since 1.15\n     ",
      "child_ranges": [
        "(line 1009,col 9)-(line 1009,col 50)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.processPaxHeader(java.lang.String, java.lang.String, java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 1021,
      "end_line": 1087,
      "comment": "\n     * Process one pax header, using the supplied map as source for extra headers to be used when handling\n     * entries for sparse files\n     *\n     * @param key  the header name.\n     * @param val  the header value.\n     * @param headers  map of headers used for dealing with sparse file.\n     * @since 1.15\n     ",
      "child_ranges": [
        "(line 1042,col 9)-(line 1086,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.getDirectoryEntries()",
      "begin_line": 1100,
      "end_line": 1116,
      "comment": "\n     * If this entry represents a file, and the file is a directory, return\n     * an array of TarEntries for this entry\u0027s children.\n     *\n     * \u003cp\u003eThis method is only useful for entries created from a {@code\n     * File} but not for entries read from an archive.\u003c/p\u003e\n     *\n     * @return An array of TarEntry\u0027s for this entry\u0027s children.\n     ",
      "child_ranges": [
        "(line 1101,col 9)-(line 1103,col 9)",
        "(line 1105,col 9)-(line 1105,col 42)",
        "(line 1106,col 9)-(line 1108,col 9)",
        "(line 1109,col 9)-(line 1109,col 74)",
        "(line 1111,col 9)-(line 1113,col 9)",
        "(line 1115,col 9)-(line 1115,col 22)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[])",
      "begin_line": 1125,
      "end_line": 1136,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * \u003cp\u003eThis method does not use the star/GNU tar/BSD tar extensions.\u003c/p\u003e\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     ",
      "child_ranges": [
        "(line 1126,col 9)-(line 1135,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 1149,
      "end_line": 1191,
      "comment": "\n     * Write an entry\u0027s header information to a header buffer.\n     *\n     * @param outbuf The tar entry header buffer to fill in.\n     * @param encoding encoding to use when writing the file name.\n     * @param starMode whether to use the star/GNU tar/BSD tar\n     * extension for numeric fields if their value doesn\u0027t fit in the\n     * maximum size of standard tar archives\n     * @since 1.4\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1151,col 9)-(line 1151,col 23)",
        "(line 1153,col 9)-(line 1154,col 52)",
        "(line 1155,col 9)-(line 1155,col 80)",
        "(line 1156,col 9)-(line 1157,col 49)",
        "(line 1158,col 9)-(line 1159,col 49)",
        "(line 1160,col 9)-(line 1160,col 80)",
        "(line 1161,col 9)-(line 1162,col 49)",
        "(line 1164,col 9)-(line 1164,col 36)",
        "(line 1166,col 9)-(line 1168,col 9)",
        "(line 1170,col 9)-(line 1170,col 36)",
        "(line 1171,col 9)-(line 1172,col 52)",
        "(line 1173,col 9)-(line 1173,col 75)",
        "(line 1174,col 9)-(line 1174,col 79)",
        "(line 1175,col 9)-(line 1176,col 52)",
        "(line 1177,col 9)-(line 1178,col 52)",
        "(line 1179,col 9)-(line 1180,col 49)",
        "(line 1181,col 9)-(line 1182,col 49)",
        "(line 1184,col 9)-(line 1186,col 9)",
        "(line 1188,col 9)-(line 1188,col 58)",
        "(line 1190,col 9)-(line 1190,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.writeEntryHeaderField(long, byte[], int, int, boolean)",
      "begin_line": 1193,
      "end_line": 1204,
      "comment": "",
      "child_ranges": [
        "(line 1195,col 9)-(line 1201,col 9)",
        "(line 1202,col 9)-(line 1203,col 61)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[])",
      "begin_line": 1212,
      "end_line": 1223,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @throws IllegalArgumentException if any of the numeric fields have an invalid format\n     ",
      "child_ranges": [
        "(line 1213,col 9)-(line 1222,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding)",
      "begin_line": 1235,
      "end_line": 1238,
      "comment": "\n     * Parse an entry\u0027s header information from a header buffer.\n     *\n     * @param header The tar entry header buffer to get information from.\n     * @param encoding encoding to use for file names\n     * @since 1.4\n     * @throws IllegalArgumentException if any of the numeric fields\n     * have an invalid format\n     * @throws IOException on error\n     ",
      "child_ranges": [
        "(line 1237,col 9)-(line 1237,col 48)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.parseTarHeader(byte[], org.apache.commons.compress.archivers.zip.ZipEncoding, boolean)",
      "begin_line": 1240,
      "end_line": 1318,
      "comment": "",
      "child_ranges": [
        "(line 1243,col 9)-(line 1243,col 23)",
        "(line 1245,col 9)-(line 1246,col 68)",
        "(line 1247,col 9)-(line 1247,col 26)",
        "(line 1248,col 9)-(line 1248,col 74)",
        "(line 1249,col 9)-(line 1249,col 26)",
        "(line 1250,col 9)-(line 1250,col 75)",
        "(line 1251,col 9)-(line 1251,col 25)",
        "(line 1252,col 9)-(line 1252,col 76)",
        "(line 1253,col 9)-(line 1253,col 25)",
        "(line 1254,col 9)-(line 1254,col 68)",
        "(line 1255,col 9)-(line 1255,col 26)",
        "(line 1256,col 9)-(line 1256,col 74)",
        "(line 1257,col 9)-(line 1257,col 29)",
        "(line 1258,col 9)-(line 1258,col 53)",
        "(line 1259,col 9)-(line 1259,col 28)",
        "(line 1260,col 9)-(line 1260,col 36)",
        "(line 1261,col 9)-(line 1262,col 68)",
        "(line 1263,col 9)-(line 1263,col 26)",
        "(line 1264,col 9)-(line 1264,col 61)",
        "(line 1265,col 9)-(line 1265,col 27)",
        "(line 1266,col 9)-(line 1266,col 65)",
        "(line 1267,col 9)-(line 1267,col 29)",
        "(line 1268,col 9)-(line 1269,col 69)",
        "(line 1270,col 9)-(line 1270,col 27)",
        "(line 1271,col 9)-(line 1272,col 69)",
        "(line 1273,col 9)-(line 1273,col 27)",
        "(line 1274,col 9)-(line 1274,col 77)",
        "(line 1275,col 9)-(line 1275,col 25)",
        "(line 1276,col 9)-(line 1276,col 77)",
        "(line 1277,col 9)-(line 1277,col 25)",
        "(line 1279,col 9)-(line 1279,col 46)",
        "(line 1280,col 9)-(line 1317,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.normalizeFileName(java.lang.String, boolean)",
      "begin_line": 1324,
      "end_line": 1361,
      "comment": "\n     * Strips Windows\u0027 drive letter as well as any leading slashes,\n     * turns path separators into forward slahes.\n     ",
      "child_ranges": [
        "(line 1326,col 9)-(line 1326,col 88)",
        "(line 1328,col 9)-(line 1350,col 9)",
        "(line 1352,col 9)-(line 1352,col 61)",
        "(line 1357,col 9)-(line 1359,col 9)",
        "(line 1360,col 9)-(line 1360,col 24)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.evaluateType(byte[])",
      "begin_line": 1369,
      "end_line": 1381,
      "comment": "\n     * Evaluate an entry\u0027s header format from a header buffer.\n     *\n     * @param header The tar entry header buffer to evaluate the format for.\n     * @return format type\n     ",
      "child_ranges": [
        "(line 1370,col 9)-(line 1372,col 9)",
        "(line 1373,col 9)-(line 1379,col 9)",
        "(line 1380,col 9)-(line 1380,col 17)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse0xData(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 1383,
      "end_line": 1390,
      "comment": "",
      "child_ranges": [
        "(line 1384,col 9)-(line 1384,col 28)",
        "(line 1385,col 9)-(line 1385,col 68)",
        "(line 1386,col 9)-(line 1389,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillGNUSparse1xData(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 1392,
      "end_line": 1396,
      "comment": "",
      "child_ranges": [
        "(line 1393,col 9)-(line 1393,col 28)",
        "(line 1394,col 9)-(line 1394,col 72)",
        "(line 1395,col 9)-(line 1395,col 46)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.tar.TarArchiveEntry.fillStarSparseData(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)",
      "begin_line": 1398,
      "end_line": 1403,
      "comment": "",
      "child_ranges": [
        "(line 1399,col 9)-(line 1399,col 26)",
        "(line 1400,col 9)-(line 1402,col 9)"
      ]
    }
  ]
}