package com.thoughtworks.theater.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Date;
import java.util.Objects;

@Table("movie")
public class Movie {
  private String aka;
  private String alt;
  private String cast;
  @Column("collect_count")
  private int collectCount;
  @Column("comments_count")
  private int commentsCount;
  private String countries;
  private String director;
  private String durations;
  private String genres;
  @Column("has_schedule")
  private boolean hasSchedule;
  @Column("has_ticket")
  private boolean hasTicket;
  @Column("has_video")
  private boolean hasVideo;
  @Id
  private String id;
  private String images;
  private String languages;
  @Column("mainland_pubdate")
  private String mainlandPubdate;
  @Column("mobile_url")
  private String mobileUrl;
  @Column("original_title")
  private String originalTitle;
  private String pubdates;
  private double rating;
  @Column("ratings_count")
  private int ratingCount;
  @Column("reviews_count")
  private int reviewsCount;
  @Column("share_url")
  private String shareUrl;
  private String summary;
  private String tags;
  private String title;
  private String writers;
  private Date year;

  public String getAka() {
    return aka;
  }

  public void setAka(String aka) {
    this.aka = aka;
  }

  public String getAlt() {
    return alt;
  }

  public void setAlt(String alt) {
    this.alt = alt;
  }

  public String getCast() {
    return cast;
  }

  public void setCast(String cast) {
    this.cast = cast;
  }

  public int getCollectCount() {
    return collectCount;
  }

  public void setCollectCount(int collectCount) {
    this.collectCount = collectCount;
  }

  public int getCommentsCount() {
    return commentsCount;
  }

  public void setCommentsCount(int commentsCount) {
    this.commentsCount = commentsCount;
  }

  public String getCountries() {
    return countries;
  }

  public void setCountries(String countries) {
    this.countries = countries;
  }

  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  public String getDurations() {
    return durations;
  }

  public void setDurations(String durations) {
    this.durations = durations;
  }

  public String getGenres() {
    return genres;
  }

  public void setGenres(String genres) {
    this.genres = genres;
  }

  public boolean isHasSchedule() {
    return hasSchedule;
  }

  public void setHasSchedule(boolean hasSchedule) {
    this.hasSchedule = hasSchedule;
  }

  public boolean isHasTicket() {
    return hasTicket;
  }

  public void setHasTicket(boolean hasTicket) {
    this.hasTicket = hasTicket;
  }

  public boolean isHasVideo() {
    return hasVideo;
  }

  public void setHasVideo(boolean hasVideo) {
    this.hasVideo = hasVideo;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getImages() {
    return images;
  }

  public void setImages(String images) {
    this.images = images;
  }

  public String getLanguages() {
    return languages;
  }

  public void setLanguages(String languages) {
    this.languages = languages;
  }

  public String getMainlandPubdate() {
    return mainlandPubdate;
  }

  public void setMainlandPubdate(String mainlandPubdate) {
    this.mainlandPubdate = mainlandPubdate;
  }

  public String getMobileUrl() {
    return mobileUrl;
  }

  public void setMobileUrl(String mobileUrl) {
    this.mobileUrl = mobileUrl;
  }

  public String getOriginalTitle() {
    return originalTitle;
  }

  public void setOriginalTitle(String originalTitle) {
    this.originalTitle = originalTitle;
  }

  public String getPubdates() {
    return pubdates;
  }

  public void setPubdates(String pubdates) {
    this.pubdates = pubdates;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }

  public int getRatingCount() {
    return ratingCount;
  }

  public void setRatingCount(int ratingCount) {
    this.ratingCount = ratingCount;
  }

  public int getReviewsCount() {
    return reviewsCount;
  }

  public void setReviewsCount(int reviewsCount) {
    this.reviewsCount = reviewsCount;
  }

  public String getShareUrl() {
    return shareUrl;
  }

  public void setShareUrl(String shareUrl) {
    this.shareUrl = shareUrl;
  }

  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public String getTags() {
    return tags;
  }

  public void setTags(String tags) {
    this.tags = tags;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getWriters() {
    return writers;
  }

  public void setWriters(String writers) {
    this.writers = writers;
  }

  public Date getYear() {
    return year;
  }

  public void setYear(Date year) {
    this.year = year;
  }

  @Override
  public String toString() {
    return "Movie{" +
        "aka='" + aka + '\'' +
        ", alt='" + alt + '\'' +
        ", cast='" + cast + '\'' +
        ", collectCount=" + collectCount +
        ", commentsCount=" + commentsCount +
        ", countries='" + countries + '\'' +
        ", director='" + director + '\'' +
        ", durations='" + durations + '\'' +
        ", genres='" + genres + '\'' +
        ", hasSchedule=" + hasSchedule +
        ", hasTicket=" + hasTicket +
        ", hasVideo=" + hasVideo +
        ", id='" + id + '\'' +
        ", images='" + images + '\'' +
        ", languages='" + languages + '\'' +
        ", mainlandPubdate='" + mainlandPubdate + '\'' +
        ", mobileUrl='" + mobileUrl + '\'' +
        ", originalTitle='" + originalTitle + '\'' +
        ", pubdates='" + pubdates + '\'' +
        ", rating=" + rating +
        ", ratingCount=" + ratingCount +
        ", reviewsCount=" + reviewsCount +
        ", shareUrl='" + shareUrl + '\'' +
        ", summary='" + summary + '\'' +
        ", tags='" + tags + '\'' +
        ", title='" + title + '\'' +
        ", writers='" + writers + '\'' +
        ", year=" + year +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Movie movie = (Movie) o;
    return collectCount == movie.collectCount &&
        commentsCount == movie.commentsCount &&
        hasSchedule == movie.hasSchedule &&
        hasTicket == movie.hasTicket &&
        hasVideo == movie.hasVideo &&
        Double.compare(movie.rating, rating) == 0 &&
        ratingCount == movie.ratingCount &&
        reviewsCount == movie.reviewsCount &&
        Objects.equals(aka, movie.aka) &&
        Objects.equals(alt, movie.alt) &&
        Objects.equals(cast, movie.cast) &&
        Objects.equals(countries, movie.countries) &&
        Objects.equals(director, movie.director) &&
        Objects.equals(durations, movie.durations) &&
        Objects.equals(genres, movie.genres) &&
        Objects.equals(id, movie.id) &&
        Objects.equals(images, movie.images) &&
        Objects.equals(languages, movie.languages) &&
        Objects.equals(mainlandPubdate, movie.mainlandPubdate) &&
        Objects.equals(mobileUrl, movie.mobileUrl) &&
        Objects.equals(originalTitle, movie.originalTitle) &&
        Objects.equals(pubdates, movie.pubdates) &&
        Objects.equals(shareUrl, movie.shareUrl) &&
        Objects.equals(summary, movie.summary) &&
        Objects.equals(tags, movie.tags) &&
        Objects.equals(title, movie.title) &&
        Objects.equals(writers, movie.writers) &&
        Objects.equals(year, movie.year);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aka, alt, cast, collectCount, commentsCount, countries, director, durations, genres, hasSchedule, hasTicket, hasVideo, id, images, languages, mainlandPubdate, mobileUrl, originalTitle, pubdates, rating, ratingCount, reviewsCount, shareUrl, summary, tags, title, writers, year);
  }
}
