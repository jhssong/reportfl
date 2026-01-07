{
  "filepath": "/tmp/Compress-21b/src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java",
  "nodes": [
    {
      "type": "class_interface",
      "name": "X5455_ExtendedTimestamp",
      "is_interface": false,
      "parent_types": [
        "org.apache.commons.compress.archivers.zip.ZipExtraField",
        "java.lang.Cloneable",
        "java.io.Serializable"
      ],
      "begin_line": 84,
      "end_line": 588,
      "comment": "\n * \u003cp\u003eAn extra field that stores additional file and directory timestamp data\n * for zip entries.   Each zip entry can include up to three timestamps\n * (modify, access, create*).  The timestamps are stored as 32 bit unsigned\n * integers representing seconds since UNIX epoch (Jan 1st, 1970, UTC).\n * This field improves on zip\u0027s default timestamp granularity, since it\n * allows one to store additional timestamps, and, in addition, the timestamps\n * are stored using per-second granularity (zip\u0027s default behaviour can only store\n * timestamps to the nearest \u003cem\u003eeven\u003c/em\u003e second).\n * \u003cp/\u003e\n * \u003c/p\u003e\u003cp\u003e\n * Unfortunately, 32 (unsigned) bits can only store dates up to the year 2106,\n * and so this extra field will eventually be obsolete.  Enjoy it while it lasts!\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e\u003cb\u003emodifyTime:\u003c/b\u003e\n * most recent time of file/directory modification\n * (or file/dir creation if the entry has not been\n * modified since it was created).\n * \u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eaccessTime:\u003c/b\u003e\n * most recent time file/directory was opened\n * (e.g., read from disk).  Many people disable\n * their operating systems from updating this value\n * using the NOATIME mount option to optimize disk behaviour,\n * and thus it\u0027s not always reliable.  In those cases\n * it\u0027s always equal to modifyTime.\n * \u003c/li\u003e\n * \u003cli\u003e\u003cb\u003e*createTime:\u003c/b\u003e\n * modern linux file systems (e.g., ext2 and newer)\n * do not appear to store a value like this, and so\n * it\u0027s usually omitted altogether in the zip extra\n * field.  Perhaps other unix systems track this.\n * \u003c/li\u003e\u003c/ul\u003e\n * \u003cp\u003e\n * We\u0027re using the field definition given in Info-Zip\u0027s source archive:\n * zip-3.0.tar.gz/proginfo/extrafld.txt\n * \u003c/p\u003e\n * \u003cpre\u003e\n * Value         Size        Description\n * -----         ----        -----------\n * 0x5455        Short       tag for this extra block type (\"UT\")\n * TSize         Short       total data size for this block\n * Flags         Byte        info bits\n * (ModTime)     Long        time of last modification (UTC/GMT)\n * (AcTime)      Long        time of last access (UTC/GMT)\n * (CrTime)      Long        time of original creation (UTC/GMT)\n *\n * Central-header version:\n *\n * Value         Size        Description\n * -----         ----        -----------\n * 0x5455        Short       tag for this extra block type (\"UT\")\n * TSize         Short       total data size for this block\n * Flags         Byte        info bits (refers to local header!)\n * (ModTime)     Long        time of last modification (UTC/GMT)\n * \u003c/pre\u003e\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 86,
      "end_line": 86,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_TIME_BIT"
      ],
      "begin_line": 92,
      "end_line": 92,
      "comment": "\n     * The bit set inside the flags by when the last modification time\n     * is present in this extra field.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ACCESS_TIME_BIT"
      ],
      "begin_line": 97,
      "end_line": 97,
      "comment": "\n     * The bit set inside the flags by when the lasr access time is\n     * present in this extra field.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CREATE_TIME_BIT"
      ],
      "begin_line": 102,
      "end_line": 102,
      "comment": "\n     * The bit set inside the flags by when the original creation time\n     * is present in this extra field.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flags"
      ],
      "begin_line": 106,
      "end_line": 106,
      "comment": " are ignored according to the current version of the spec (December 2012)."
    },
    {
      "type": "field",
      "varNames": [
        "bit0_modifyTimePresent"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": " !\u003d null and length checks."
    },
    {
      "type": "field",
      "varNames": [
        "bit1_accessTimePresent"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bit2_createTimePresent"
      ],
      "begin_line": 114,
      "end_line": 114,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifyTime"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accessTime"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createTime"
      ],
      "begin_line": 118,
      "end_line": 118,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.X5455_ExtendedTimestamp()",
      "begin_line": 123,
      "end_line": 123,
      "comment": "\n     * Constructor for X5455_ExtendedTimestamp.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getHeaderId()",
      "begin_line": 130,
      "end_line": 132,
      "comment": "\n     * The Header-ID.\n     *\n     * @return the value for the header id for this extrafield\n     ",
      "child_ranges": [
        "(line 131,col 9)-(line 131,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataLength()",
      "begin_line": 140,
      "end_line": 146,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 141,col 9)-(line 145,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryLength()",
      "begin_line": 158,
      "end_line": 162,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     * \u003cp/\u003e\n     * For X5455 the central length is often smaller than the\n     * local length, because central cannot contain access or create\n     * timestamps.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 159,col 9)-(line 161,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData()",
      "begin_line": 170,
      "end_line": 190,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 171,col 9)-(line 171,col 68)",
        "(line 172,col 9)-(line 172,col 20)",
        "(line 173,col 9)-(line 173,col 24)",
        "(line 174,col 9)-(line 178,col 9)",
        "(line 179,col 9)-(line 183,col 9)",
        "(line 184,col 9)-(line 188,col 9)",
        "(line 189,col 9)-(line 189,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryData()",
      "begin_line": 198,
      "end_line": 206,
      "comment": "\n     * The actual data to put into central directory data - without Header-ID\n     * or length specifier.\n     *\n     * @return the central directory data\n     ",
      "child_ranges": [
        "(line 199,col 9)-(line 199,col 78)",
        "(line 200,col 9)-(line 200,col 50)",
        "(line 204,col 9)-(line 204,col 75)",
        "(line 205,col 9)-(line 205,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 216,
      "end_line": 237,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param data   an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws java.util.zip.ZipException on error\n     ",
      "child_ranges": [
        "(line 219,col 9)-(line 219,col 16)",
        "(line 220,col 9)-(line 220,col 40)",
        "(line 221,col 9)-(line 221,col 33)",
        "(line 222,col 9)-(line 225,col 9)",
        "(line 229,col 9)-(line 232,col 9)",
        "(line 233,col 9)-(line 236,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 243,
      "end_line": 248,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same parsing logic for both central directory and local file data.\n     ",
      "child_ranges": [
        "(line 246,col 9)-(line 246,col 16)",
        "(line 247,col 9)-(line 247,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.reset()",
      "begin_line": 254,
      "end_line": 259,
      "comment": "\n     * Reset state back to newly constructed state.  Helps us make sure\n     * parse() calls always generate clean results.\n     ",
      "child_ranges": [
        "(line 255,col 9)-(line 255,col 27)",
        "(line 256,col 9)-(line 256,col 31)",
        "(line 257,col 9)-(line 257,col 31)",
        "(line 258,col 9)-(line 258,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setFlags(byte)",
      "begin_line": 275,
      "end_line": 280,
      "comment": "\n     * Sets flags byte.  The flags byte tells us which of the\n     * three datestamp fields are present in the data:\n     * \u003cpre\u003e\n     * bit0 - modify time\n     * bit1 - access time\n     * bit2 - create time\n     * \u003c/pre\u003e\n     * Only first 3 bits of flags are used according to the\n     * latest version of the spec (December 2012).\n     *\n     * @param flags flags byte indicating which of the\n     *              three datestamp fields are present.\n     ",
      "child_ranges": [
        "(line 276,col 9)-(line 276,col 27)",
        "(line 277,col 9)-(line 277,col 83)",
        "(line 278,col 9)-(line 278,col 83)",
        "(line 279,col 9)-(line 279,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getFlags()",
      "begin_line": 296,
      "end_line": 296,
      "comment": "\n     * Gets flags byte.  The flags byte tells us which of the\n     * three datestamp fields are present in the data:\n     * \u003cpre\u003e\n     * bit0 - modify time\n     * bit1 - access time\n     * bit2 - create time\n     * \u003c/pre\u003e\n     * Only first 3 bits of flags are used according to the\n     * latest version of the spec (December 2012).\n     *\n     * @return flags byte indicating which of the\n     *         three datestamp fields are present.\n     ",
      "child_ranges": [
        "(line 296,col 30)-(line 296,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit0_modifyTimePresent()",
      "begin_line": 305,
      "end_line": 305,
      "comment": "\n     * Returns whether bit0 of the flags byte is set or not,\n     * which should correspond to the presence or absence of\n     * a modify timestamp in this particular zip entry.\n     *\n     * @return true if bit0 of the flags byte is set.\n     ",
      "child_ranges": [
        "(line 305,col 49)-(line 305,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit1_accessTimePresent()",
      "begin_line": 314,
      "end_line": 314,
      "comment": "\n     * Returns whether bit1 of the flags byte is set or not,\n     * which should correspond to the presence or absence of\n     * a \"last access\" timestamp in this particular zip entry.\n     *\n     * @return true if bit1 of the flags byte is set.\n     ",
      "child_ranges": [
        "(line 314,col 49)-(line 314,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit2_createTimePresent()",
      "begin_line": 323,
      "end_line": 323,
      "comment": "\n     * Returns whether bit2 of the flags byte is set or not,\n     * which should correspond to the presence or absence of\n     * a create timestamp in this particular zip entry.\n     *\n     * @return true if bit2 of the flags byte is set.\n     ",
      "child_ranges": [
        "(line 323,col 49)-(line 323,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getModifyTime()",
      "begin_line": 332,
      "end_line": 332,
      "comment": "\n     * Returns the modify time (seconds since epoch) of this zip entry\n     * as a ZipLong object, or null if no such timestamp exists in the\n     * zip entry.\n     *\n     * @return modify time (seconds since epoch) or null.\n     ",
      "child_ranges": [
        "(line 332,col 38)-(line 332,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getAccessTime()",
      "begin_line": 341,
      "end_line": 341,
      "comment": "\n     * Returns the access time (seconds since epoch) of this zip entry\n     * as a ZipLong object, or null if no such timestamp exists in the\n     * zip entry.\n     *\n     * @return access time (seconds since epoch) or null.\n     ",
      "child_ranges": [
        "(line 341,col 38)-(line 341,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCreateTime()",
      "begin_line": 356,
      "end_line": 356,
      "comment": "\n     * \u003cp\u003e\n     * Returns the create time (seconds since epoch) of this zip entry\n     * as a ZipLong object, or null if no such timestamp exists in the\n     * zip entry.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: modern linux file systems (e.g., ext2)\n     * do not appear to store a \"create time\" value, and so\n     * it\u0027s usually omitted altogether in the zip extra\n     * field.  Perhaps other unix systems track this.\n     *\n     * @return create time (seconds since epoch) or null.\n     ",
      "child_ranges": [
        "(line 356,col 38)-(line 356,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getModifyJavaTime()",
      "begin_line": 366,
      "end_line": 368,
      "comment": "\n     * Returns the modify time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     * The milliseconds are always zeroed out, since the underlying data\n     * offers only per-second precision.\n     *\n     * @return modify time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 367,col 9)-(line 367,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getAccessJavaTime()",
      "begin_line": 378,
      "end_line": 380,
      "comment": "\n     * Returns the access time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     * The milliseconds are always zeroed out, since the underlying data\n     * offers only per-second precision.\n     *\n     * @return access time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 379,col 9)-(line 379,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCreateJavaTime()",
      "begin_line": 396,
      "end_line": 398,
      "comment": "\n     * \u003cp\u003e\n     * Returns the create time as a a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     * The milliseconds are always zeroed out, since the underlying data\n     * offers only per-second precision.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: modern linux file systems (e.g., ext2)\n     * do not appear to store a \"create time\" value, and so\n     * it\u0027s usually omitted altogether in the zip extra\n     * field.  Perhaps other unix systems track this.\n     *\n     * @return create time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 397,col 9)-(line 397,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setModifyTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 412,
      "end_line": 417,
      "comment": "\n     * \u003cp\u003e\n     * Sets the modify time (seconds since epoch) of this zip entry\n     * using a ZipLong object.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param l ZipLong of the modify time (seconds per epoch)\n     ",
      "child_ranges": [
        "(line 413,col 9)-(line 413,col 43)",
        "(line 414,col 9)-(line 415,col 54)",
        "(line 416,col 9)-(line 416,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setAccessTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 431,
      "end_line": 436,
      "comment": "\n     * \u003cp\u003e\n     * Sets the access time (seconds since epoch) of this zip entry\n     * using a ZipLong object\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param l ZipLong of the access time (seconds per epoch)\n     ",
      "child_ranges": [
        "(line 432,col 9)-(line 432,col 43)",
        "(line 433,col 9)-(line 434,col 54)",
        "(line 435,col 9)-(line 435,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setCreateTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 450,
      "end_line": 455,
      "comment": "\n     * \u003cp\u003e\n     * Sets the create time (seconds since epoch) of this zip entry\n     * using a ZipLong object\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param l ZipLong of the create time (seconds per epoch)\n     ",
      "child_ranges": [
        "(line 451,col 9)-(line 451,col 43)",
        "(line 452,col 9)-(line 453,col 54)",
        "(line 454,col 9)-(line 454,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setModifyJavaTime(java.util.Date)",
      "begin_line": 470,
      "end_line": 470,
      "comment": "\n     * \u003cp\u003e\n     * Sets the modify time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d modify time as java.util.Date\n     ",
      "child_ranges": [
        "(line 470,col 45)-(line 470,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setAccessJavaTime(java.util.Date)",
      "begin_line": 485,
      "end_line": 485,
      "comment": "\n     * \u003cp\u003e\n     * Sets the access time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d access time as java.util.Date\n     ",
      "child_ranges": [
        "(line 485,col 45)-(line 485,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setCreateJavaTime(java.util.Date)",
      "begin_line": 500,
      "end_line": 500,
      "comment": "\n     * \u003cp\u003e\n     * Sets the create time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d create time as java.util.Date\n     ",
      "child_ranges": [
        "(line 500,col 45)-(line 500,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.dateToZipLong(java.util.Date)",
      "begin_line": 512,
      "end_line": 521,
      "comment": "\n     * Utility method converts java.util.Date (milliseconds since epoch)\n     * into a ZipLong (seconds since epoch).\n     * \u003cp/\u003e\n     * Also makes sure the converted ZipLong is not too big to fit\n     * in 32 unsigned bits.\n     *\n     * @param d java.util.Date to convert to ZipLong\n     * @return ZipLong\n     ",
      "child_ranges": [
        "(line 513,col 9)-(line 513,col 39)",
        "(line 515,col 9)-(line 515,col 44)",
        "(line 516,col 9)-(line 516,col 42)",
        "(line 517,col 9)-(line 519,col 9)",
        "(line 520,col 9)-(line 520,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.toString()",
      "begin_line": 530,
      "end_line": 548,
      "comment": "\n     * Returns a String representation of this class useful for\n     * debugging purposes.\n     *\n     * @return A String representation of this class useful for\n     *         debugging purposes.\n     ",
      "child_ranges": [
        "(line 532,col 9)-(line 532,col 48)",
        "(line 533,col 9)-(line 533,col 53)",
        "(line 534,col 9)-(line 534,col 95)",
        "(line 535,col 9)-(line 538,col 9)",
        "(line 539,col 9)-(line 542,col 9)",
        "(line 543,col 9)-(line 546,col 9)",
        "(line 547,col 9)-(line 547,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.clone()",
      "begin_line": 550,
      "end_line": 553,
      "comment": "",
      "child_ranges": [
        "(line 552,col 9)-(line 552,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.equals(java.lang.Object)",
      "begin_line": 555,
      "end_line": 569,
      "comment": "",
      "child_ranges": [
        "(line 557,col 9)-(line 568,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.hashCode()",
      "begin_line": 571,
      "end_line": 586,
      "comment": "",
      "child_ranges": [
        "(line 573,col 9)-(line 573,col 41)",
        "(line 574,col 9)-(line 576,col 9)",
        "(line 577,col 9)-(line 581,col 9)",
        "(line 582,col 9)-(line 584,col 9)",
        "(line 585,col 9)-(line 585,col 18)"
      ]
    }
  ]
}