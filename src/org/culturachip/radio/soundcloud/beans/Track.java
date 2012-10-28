package org.culturachip.radio.soundcloud.beans;

public class Track {
	public int id;
	public String created_at;
	public int user_id;
	public User user;
	public String title;
	public String permalink;
	public String permalink_url;
	public String uri;
	public String sharing;
	public String purchase_url;
	public String artwork_url;
	public String description;
	public Label label;
	public long duration;
	public String genre;
	public String shared_to_count;
	public String tag_list;
	public int label_id;
	public String label_name;
	public String license;
	public int release;
	public int release_day;
	public int release_month;
	public int release_year;
	public boolean streamable;
	public boolean downloadable;
	public String state;
	public String track_type;
	public String waveform_url;
	public String download_url;
	public String stream_url;
	public String video_url;
	public int bpm;
	public boolean commentable;
	public String isrc;
	public String key_signature;
	public int comment_count;
	public int download_count;
	public int playback_count;
	public int favoritings_count;
	public String original_format;
	public App created_with;
	public String asset_data;
	public String artwork_data;
	public int user_favorite;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String createdAt) {
		created_at = createdAt;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int userId) {
		user_id = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPermalink() {
		return permalink;
	}

	public void setPermalink(String permalink) {
		this.permalink = permalink;
	}

	public String getPermalink_url() {
		return permalink_url;
	}

	public void setPermalink_url(String permalinkUrl) {
		permalink_url = permalinkUrl;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public String getSharing() {
		return sharing;
	}

	public void setSharing(String sharing) {
		this.sharing = sharing;
	}

	public String getPurchase_url() {
		return purchase_url;
	}

	public void setPurchase_url(String purchaseUrl) {
		purchase_url = purchaseUrl;
	}

	public String getArtwork_url() {
		return artwork_url;
	}

	public void setArtwork_url(String artworkUrl) {
		artwork_url = artworkUrl;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Label getLabel() {
		return label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public long getDuration() {
		return duration;
	}

	public void setDuration(long duration) {
		this.duration = duration;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getShared_to_count() {
		return shared_to_count;
	}

	public void setShared_to_count(String sharedToCount) {
		shared_to_count = sharedToCount;
	}

	public String getTag_list() {
		return tag_list;
	}

	public void setTag_list(String tagList) {
		tag_list = tagList;
	}

	public int getLabel_id() {
		return label_id;
	}

	public void setLabel_id(int labelId) {
		label_id = labelId;
	}

	public String getLabel_name() {
		return label_name;
	}

	public void setLabel_name(String labelName) {
		label_name = labelName;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public int getRelease() {
		return release;
	}

	public void setRelease(int release) {
		this.release = release;
	}

	public int getRelease_day() {
		return release_day;
	}

	public void setRelease_day(int releaseDay) {
		release_day = releaseDay;
	}

	public int getRelease_month() {
		return release_month;
	}

	public void setRelease_month(int releaseMonth) {
		release_month = releaseMonth;
	}

	public int getRelease_year() {
		return release_year;
	}

	public void setRelease_year(int releaseYear) {
		release_year = releaseYear;
	}

	public boolean isStreamable() {
		return streamable;
	}

	public void setStreamable(boolean streamable) {
		this.streamable = streamable;
	}

	public boolean isDownloadable() {
		return downloadable;
	}

	public void setDownloadable(boolean downloadable) {
		this.downloadable = downloadable;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTrack_type() {
		return track_type;
	}

	public void setTrack_type(String trackType) {
		track_type = trackType;
	}

	public String getWaveform_url() {
		return waveform_url;
	}

	public void setWaveform_url(String waveformUrl) {
		waveform_url = waveformUrl;
	}

	public String getDownload_url() {
		return download_url;
	}

	public void setDownload_url(String downloadUrl) {
		download_url = downloadUrl;
	}

	public String getStream_url() {
		return stream_url;
	}

	public void setStream_url(String streamUrl) {
		stream_url = streamUrl;
	}

	public String getVideo_url() {
		return video_url;
	}

	public void setVideo_url(String videoUrl) {
		video_url = videoUrl;
	}

	public int getBpm() {
		return bpm;
	}

	public void setBpm(int bpm) {
		this.bpm = bpm;
	}

	public boolean isCommentable() {
		return commentable;
	}

	public void setCommentable(boolean commentable) {
		this.commentable = commentable;
	}

	public String getIsrc() {
		return isrc;
	}

	public void setIsrc(String isrc) {
		this.isrc = isrc;
	}

	public String getKey_signature() {
		return key_signature;
	}

	public void setKey_signature(String keySignature) {
		key_signature = keySignature;
	}

	public int getComment_count() {
		return comment_count;
	}

	public void setComment_count(int commentCount) {
		comment_count = commentCount;
	}

	public int getDownload_count() {
		return download_count;
	}

	public void setDownload_count(int downloadCount) {
		download_count = downloadCount;
	}

	public int getPlayback_count() {
		return playback_count;
	}

	public void setPlayback_count(int playbackCount) {
		playback_count = playbackCount;
	}

	public int getFavoritings_count() {
		return favoritings_count;
	}

	public void setFavoritings_count(int favoritingsCount) {
		favoritings_count = favoritingsCount;
	}

	public String getOriginal_format() {
		return original_format;
	}

	public void setOriginal_format(String originalFormat) {
		original_format = originalFormat;
	}

	public App getCreated_with() {
		return created_with;
	}

	public void setCreated_with(App createdWith) {
		created_with = createdWith;
	}

	public String getAsset_data() {
		return asset_data;
	}

	public void setAsset_data(String assetData) {
		asset_data = assetData;
	}

	public String getArtwork_data() {
		return artwork_data;
	}

	public void setArtwork_data(String artworkData) {
		artwork_data = artworkData;
	}

	public int getUser_favorite() {
		return user_favorite;
	}

	public void setUser_favorite(int userFavorite) {
		user_favorite = userFavorite;
	}

}