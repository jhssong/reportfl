{
  "filepath": "/tmp/Compress-31b/src/main/java/org/apache/commons/compress/archivers/zip/X5455_ExtendedTimestamp.java",
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
      "begin_line": 83,
      "end_line": 587,
      "comment": "\n * \u003cp\u003eAn extra field that stores additional file and directory timestamp data\n * for zip entries.   Each zip entry can include up to three timestamps\n * (modify, access, create*).  The timestamps are stored as 32 bit unsigned\n * integers representing seconds since UNIX epoch (Jan 1st, 1970, UTC).\n * This field improves on zip\u0027s default timestamp granularity, since it\n * allows one to store additional timestamps, and, in addition, the timestamps\n * are stored using per-second granularity (zip\u0027s default behaviour can only store\n * timestamps to the nearest \u003cem\u003eeven\u003c/em\u003e second).\n * \u003c/p\u003e\u003cp\u003e\n * Unfortunately, 32 (unsigned) bits can only store dates up to the year 2106,\n * and so this extra field will eventually be obsolete.  Enjoy it while it lasts!\n * \u003c/p\u003e\n * \u003cul\u003e\n * \u003cli\u003e\u003cb\u003emodifyTime:\u003c/b\u003e\n * most recent time of file/directory modification\n * (or file/dir creation if the entry has not been\n * modified since it was created).\n * \u003c/li\u003e\n * \u003cli\u003e\u003cb\u003eaccessTime:\u003c/b\u003e\n * most recent time file/directory was opened\n * (e.g., read from disk).  Many people disable\n * their operating systems from updating this value\n * using the NOATIME mount option to optimize disk behaviour,\n * and thus it\u0027s not always reliable.  In those cases\n * it\u0027s always equal to modifyTime.\n * \u003c/li\u003e\n * \u003cli\u003e\u003cb\u003e*createTime:\u003c/b\u003e\n * modern linux file systems (e.g., ext2 and newer)\n * do not appear to store a value like this, and so\n * it\u0027s usually omitted altogether in the zip extra\n * field.  Perhaps other unix systems track this.\n * \u003c/li\u003e\u003c/ul\u003e\n * \u003cp\u003e\n * We\u0027re using the field definition given in Info-Zip\u0027s source archive:\n * zip-3.0.tar.gz/proginfo/extrafld.txt\n * \u003c/p\u003e\n * \u003cpre\u003e\n * Value         Size        Description\n * -----         ----        -----------\n * 0x5455        Short       tag for this extra block type (\"UT\")\n * TSize         Short       total data size for this block\n * Flags         Byte        info bits\n * (ModTime)     Long        time of last modification (UTC/GMT)\n * (AcTime)      Long        time of last access (UTC/GMT)\n * (CrTime)      Long        time of original creation (UTC/GMT)\n *\n * Central-header version:\n *\n * Value         Size        Description\n * -----         ----        -----------\n * 0x5455        Short       tag for this extra block type (\"UT\")\n * TSize         Short       total data size for this block\n * Flags         Byte        info bits (refers to local header!)\n * (ModTime)     Long        time of last modification (UTC/GMT)\n * \u003c/pre\u003e\n * @since 1.5\n "
    },
    {
      "type": "field",
      "varNames": [
        "HEADER_ID"
      ],
      "begin_line": 84,
      "end_line": 84,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "serialVersionUID"
      ],
      "begin_line": 85,
      "end_line": 85,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "MODIFY_TIME_BIT"
      ],
      "begin_line": 91,
      "end_line": 91,
      "comment": "\n     * The bit set inside the flags by when the last modification time\n     * is present in this extra field.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "ACCESS_TIME_BIT"
      ],
      "begin_line": 96,
      "end_line": 96,
      "comment": "\n     * The bit set inside the flags by when the lasr access time is\n     * present in this extra field.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "CREATE_TIME_BIT"
      ],
      "begin_line": 101,
      "end_line": 101,
      "comment": "\n     * The bit set inside the flags by when the original creation time\n     * is present in this extra field.\n     "
    },
    {
      "type": "field",
      "varNames": [
        "flags"
      ],
      "begin_line": 105,
      "end_line": 105,
      "comment": " are ignored according to the current version of the spec (December 2012)."
    },
    {
      "type": "field",
      "varNames": [
        "bit0_modifyTimePresent"
      ],
      "begin_line": 111,
      "end_line": 111,
      "comment": " !\u003d null and length checks."
    },
    {
      "type": "field",
      "varNames": [
        "bit1_accessTimePresent"
      ],
      "begin_line": 112,
      "end_line": 112,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "bit2_createTimePresent"
      ],
      "begin_line": 113,
      "end_line": 113,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "modifyTime"
      ],
      "begin_line": 115,
      "end_line": 115,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "accessTime"
      ],
      "begin_line": 116,
      "end_line": 116,
      "comment": ""
    },
    {
      "type": "field",
      "varNames": [
        "createTime"
      ],
      "begin_line": 117,
      "end_line": 117,
      "comment": ""
    },
    {
      "type": "constructor",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.X5455_ExtendedTimestamp()",
      "begin_line": 122,
      "end_line": 122,
      "comment": "\n     * Constructor for X5455_ExtendedTimestamp.\n     ",
      "child_ranges": []
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getHeaderId()",
      "begin_line": 129,
      "end_line": 131,
      "comment": "\n     * The Header-ID.\n     *\n     * @return the value for the header id for this extrafield\n     ",
      "child_ranges": [
        "(line 130,col 9)-(line 130,col 25)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataLength()",
      "begin_line": 139,
      "end_line": 145,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 140,col 9)-(line 144,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryLength()",
      "begin_line": 157,
      "end_line": 161,
      "comment": "\n     * Length of the extra field in the local file data - without\n     * Header-ID or length specifier.\n     *\n     * \u003cp\u003eFor X5455 the central length is often smaller than the\n     * local length, because central cannot contain access or create\n     * timestamps.\u003c/p\u003e\n     *\n     * @return a \u003ccode\u003eZipShort\u003c/code\u003e for the length of the data of this extra field\n     ",
      "child_ranges": [
        "(line 158,col 9)-(line 160,col 10)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getLocalFileDataData()",
      "begin_line": 169,
      "end_line": 189,
      "comment": "\n     * The actual data to put into local file data - without Header-ID\n     * or length specifier.\n     *\n     * @return get the data\n     ",
      "child_ranges": [
        "(line 170,col 9)-(line 170,col 68)",
        "(line 171,col 9)-(line 171,col 20)",
        "(line 172,col 9)-(line 172,col 24)",
        "(line 173,col 9)-(line 177,col 9)",
        "(line 178,col 9)-(line 182,col 9)",
        "(line 183,col 9)-(line 187,col 9)",
        "(line 188,col 9)-(line 188,col 20)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCentralDirectoryData()",
      "begin_line": 197,
      "end_line": 205,
      "comment": "\n     * The actual data to put into central directory data - without Header-ID\n     * or length specifier.\n     *\n     * @return the central directory data\n     ",
      "child_ranges": [
        "(line 198,col 9)-(line 198,col 78)",
        "(line 199,col 9)-(line 199,col 50)",
        "(line 203,col 9)-(line 203,col 75)",
        "(line 204,col 9)-(line 204,col 27)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromLocalFileData(byte[], int, int)",
      "begin_line": 215,
      "end_line": 236,
      "comment": "\n     * Populate data from this array as if it was in local file data.\n     *\n     * @param data   an array of bytes\n     * @param offset the start offset\n     * @param length the number of bytes in the array from offset\n     * @throws java.util.zip.ZipException on error\n     ",
      "child_ranges": [
        "(line 218,col 9)-(line 218,col 16)",
        "(line 219,col 9)-(line 219,col 40)",
        "(line 220,col 9)-(line 220,col 33)",
        "(line 221,col 9)-(line 224,col 9)",
        "(line 228,col 9)-(line 231,col 9)",
        "(line 232,col 9)-(line 235,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.parseFromCentralDirectoryData(byte[], int, int)",
      "begin_line": 242,
      "end_line": 247,
      "comment": "\n     * Doesn\u0027t do anything special since this class always uses the\n     * same parsing logic for both central directory and local file data.\n     ",
      "child_ranges": [
        "(line 245,col 9)-(line 245,col 16)",
        "(line 246,col 9)-(line 246,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.reset()",
      "begin_line": 253,
      "end_line": 258,
      "comment": "\n     * Reset state back to newly constructed state.  Helps us make sure\n     * parse() calls always generate clean results.\n     ",
      "child_ranges": [
        "(line 254,col 9)-(line 254,col 27)",
        "(line 255,col 9)-(line 255,col 31)",
        "(line 256,col 9)-(line 256,col 31)",
        "(line 257,col 9)-(line 257,col 31)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setFlags(byte)",
      "begin_line": 274,
      "end_line": 279,
      "comment": "\n     * Sets flags byte.  The flags byte tells us which of the\n     * three datestamp fields are present in the data:\n     * \u003cpre\u003e\n     * bit0 - modify time\n     * bit1 - access time\n     * bit2 - create time\n     * \u003c/pre\u003e\n     * Only first 3 bits of flags are used according to the\n     * latest version of the spec (December 2012).\n     *\n     * @param flags flags byte indicating which of the\n     *              three datestamp fields are present.\n     ",
      "child_ranges": [
        "(line 275,col 9)-(line 275,col 27)",
        "(line 276,col 9)-(line 276,col 83)",
        "(line 277,col 9)-(line 277,col 83)",
        "(line 278,col 9)-(line 278,col 83)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getFlags()",
      "begin_line": 295,
      "end_line": 295,
      "comment": "\n     * Gets flags byte.  The flags byte tells us which of the\n     * three datestamp fields are present in the data:\n     * \u003cpre\u003e\n     * bit0 - modify time\n     * bit1 - access time\n     * bit2 - create time\n     * \u003c/pre\u003e\n     * Only first 3 bits of flags are used according to the\n     * latest version of the spec (December 2012).\n     *\n     * @return flags byte indicating which of the\n     *         three datestamp fields are present.\n     ",
      "child_ranges": [
        "(line 295,col 30)-(line 295,col 42)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit0_modifyTimePresent()",
      "begin_line": 304,
      "end_line": 304,
      "comment": "\n     * Returns whether bit0 of the flags byte is set or not,\n     * which should correspond to the presence or absence of\n     * a modify timestamp in this particular zip entry.\n     *\n     * @return true if bit0 of the flags byte is set.\n     ",
      "child_ranges": [
        "(line 304,col 49)-(line 304,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit1_accessTimePresent()",
      "begin_line": 313,
      "end_line": 313,
      "comment": "\n     * Returns whether bit1 of the flags byte is set or not,\n     * which should correspond to the presence or absence of\n     * a \"last access\" timestamp in this particular zip entry.\n     *\n     * @return true if bit1 of the flags byte is set.\n     ",
      "child_ranges": [
        "(line 313,col 49)-(line 313,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.isBit2_createTimePresent()",
      "begin_line": 322,
      "end_line": 322,
      "comment": "\n     * Returns whether bit2 of the flags byte is set or not,\n     * which should correspond to the presence or absence of\n     * a create timestamp in this particular zip entry.\n     *\n     * @return true if bit2 of the flags byte is set.\n     ",
      "child_ranges": [
        "(line 322,col 49)-(line 322,col 78)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getModifyTime()",
      "begin_line": 331,
      "end_line": 331,
      "comment": "\n     * Returns the modify time (seconds since epoch) of this zip entry\n     * as a ZipLong object, or null if no such timestamp exists in the\n     * zip entry.\n     *\n     * @return modify time (seconds since epoch) or null.\n     ",
      "child_ranges": [
        "(line 331,col 38)-(line 331,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getAccessTime()",
      "begin_line": 340,
      "end_line": 340,
      "comment": "\n     * Returns the access time (seconds since epoch) of this zip entry\n     * as a ZipLong object, or null if no such timestamp exists in the\n     * zip entry.\n     *\n     * @return access time (seconds since epoch) or null.\n     ",
      "child_ranges": [
        "(line 340,col 38)-(line 340,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCreateTime()",
      "begin_line": 355,
      "end_line": 355,
      "comment": "\n     * \u003cp\u003e\n     * Returns the create time (seconds since epoch) of this zip entry\n     * as a ZipLong object, or null if no such timestamp exists in the\n     * zip entry.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: modern linux file systems (e.g., ext2)\n     * do not appear to store a \"create time\" value, and so\n     * it\u0027s usually omitted altogether in the zip extra\n     * field.  Perhaps other unix systems track this.\n     *\n     * @return create time (seconds since epoch) or null.\n     ",
      "child_ranges": [
        "(line 355,col 38)-(line 355,col 55)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getModifyJavaTime()",
      "begin_line": 365,
      "end_line": 367,
      "comment": "\n     * Returns the modify time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     * The milliseconds are always zeroed out, since the underlying data\n     * offers only per-second precision.\n     *\n     * @return modify time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 366,col 9)-(line 366,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getAccessJavaTime()",
      "begin_line": 377,
      "end_line": 379,
      "comment": "\n     * Returns the access time as a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     * The milliseconds are always zeroed out, since the underlying data\n     * offers only per-second precision.\n     *\n     * @return access time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 378,col 9)-(line 378,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.getCreateJavaTime()",
      "begin_line": 395,
      "end_line": 397,
      "comment": "\n     * \u003cp\u003e\n     * Returns the create time as a a java.util.Date\n     * of this zip entry, or null if no such timestamp exists in the zip entry.\n     * The milliseconds are always zeroed out, since the underlying data\n     * offers only per-second precision.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: modern linux file systems (e.g., ext2)\n     * do not appear to store a \"create time\" value, and so\n     * it\u0027s usually omitted altogether in the zip extra\n     * field.  Perhaps other unix systems track this.\n     *\n     * @return create time as java.util.Date or null.\n     ",
      "child_ranges": [
        "(line 396,col 9)-(line 396,col 82)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setModifyTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 411,
      "end_line": 416,
      "comment": "\n     * \u003cp\u003e\n     * Sets the modify time (seconds since epoch) of this zip entry\n     * using a ZipLong object.\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param l ZipLong of the modify time (seconds per epoch)\n     ",
      "child_ranges": [
        "(line 412,col 9)-(line 412,col 43)",
        "(line 413,col 9)-(line 414,col 54)",
        "(line 415,col 9)-(line 415,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setAccessTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 430,
      "end_line": 435,
      "comment": "\n     * \u003cp\u003e\n     * Sets the access time (seconds since epoch) of this zip entry\n     * using a ZipLong object\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param l ZipLong of the access time (seconds per epoch)\n     ",
      "child_ranges": [
        "(line 431,col 9)-(line 431,col 43)",
        "(line 432,col 9)-(line 433,col 54)",
        "(line 434,col 9)-(line 434,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setCreateTime(org.apache.commons.compress.archivers.zip.ZipLong)",
      "begin_line": 449,
      "end_line": 454,
      "comment": "\n     * \u003cp\u003e\n     * Sets the create time (seconds since epoch) of this zip entry\n     * using a ZipLong object\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param l ZipLong of the create time (seconds per epoch)\n     ",
      "child_ranges": [
        "(line 450,col 9)-(line 450,col 43)",
        "(line 451,col 9)-(line 452,col 54)",
        "(line 453,col 9)-(line 453,col 28)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setModifyJavaTime(java.util.Date)",
      "begin_line": 469,
      "end_line": 469,
      "comment": "\n     * \u003cp\u003e\n     * Sets the modify time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d modify time as java.util.Date\n     ",
      "child_ranges": [
        "(line 469,col 45)-(line 469,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setAccessJavaTime(java.util.Date)",
      "begin_line": 484,
      "end_line": 484,
      "comment": "\n     * \u003cp\u003e\n     * Sets the access time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d access time as java.util.Date\n     ",
      "child_ranges": [
        "(line 484,col 45)-(line 484,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.setCreateJavaTime(java.util.Date)",
      "begin_line": 499,
      "end_line": 499,
      "comment": "\n     * \u003cp\u003e\n     * Sets the create time as a java.util.Date\n     * of this zip entry.  Supplied value is truncated to per-second\n     * precision (milliseconds zeroed-out).\n     * \u003c/p\u003e\u003cp\u003e\n     * Note: the setters for flags and timestamps are decoupled.\n     * Even if the timestamp is not-null, it will only be written\n     * out if the corresponding bit in the flags is also set.\n     * \u003c/p\u003e\n     *\n     * @param d create time as java.util.Date\n     ",
      "child_ranges": [
        "(line 499,col 45)-(line 499,col 76)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.dateToZipLong(java.util.Date)",
      "begin_line": 511,
      "end_line": 520,
      "comment": "\n     * Utility method converts java.util.Date (milliseconds since epoch)\n     * into a ZipLong (seconds since epoch).\n     * \u003cp/\u003e\n     * Also makes sure the converted ZipLong is not too big to fit\n     * in 32 unsigned bits.\n     *\n     * @param d java.util.Date to convert to ZipLong\n     * @return ZipLong\n     ",
      "child_ranges": [
        "(line 512,col 9)-(line 512,col 39)",
        "(line 514,col 9)-(line 514,col 44)",
        "(line 515,col 9)-(line 515,col 42)",
        "(line 516,col 9)-(line 518,col 9)",
        "(line 519,col 9)-(line 519,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.toString()",
      "begin_line": 529,
      "end_line": 547,
      "comment": "\n     * Returns a String representation of this class useful for\n     * debugging purposes.\n     *\n     * @return A String representation of this class useful for\n     *         debugging purposes.\n     ",
      "child_ranges": [
        "(line 531,col 9)-(line 531,col 48)",
        "(line 532,col 9)-(line 532,col 53)",
        "(line 533,col 9)-(line 533,col 95)",
        "(line 534,col 9)-(line 537,col 9)",
        "(line 538,col 9)-(line 541,col 9)",
        "(line 542,col 9)-(line 545,col 9)",
        "(line 546,col 9)-(line 546,col 30)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.clone()",
      "begin_line": 549,
      "end_line": 552,
      "comment": "",
      "child_ranges": [
        "(line 551,col 9)-(line 551,col 29)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.equals(java.lang.Object)",
      "begin_line": 554,
      "end_line": 568,
      "comment": "",
      "child_ranges": [
        "(line 556,col 9)-(line 567,col 9)"
      ]
    },
    {
      "type": "method",
      "signature": "org.apache.commons.compress.archivers.zip.X5455_ExtendedTimestamp.hashCode()",
      "begin_line": 570,
      "end_line": 585,
      "comment": "",
      "child_ranges": [
        "(line 572,col 9)-(line 572,col 41)",
        "(line 573,col 9)-(line 575,col 9)",
        "(line 576,col 9)-(line 580,col 9)",
        "(line 581,col 9)-(line 583,col 9)",
        "(line 584,col 9)-(line 584,col 18)"
      ]
    }
  ]
}