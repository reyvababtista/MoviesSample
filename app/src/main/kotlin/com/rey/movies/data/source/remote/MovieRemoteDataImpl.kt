package com.rey.movies.data.source.remote

import com.rey.lib.cleanarch.data.source.remote.mapper.ResponseMapper
import com.rey.lib.cleanarch.domain.dto.Result
import com.rey.lib.cleanarch.domain.dto.suspendTryCatch
import com.rey.movies.data.repository.source.remote.MovieRemoteData
import com.rey.movies.data.source.remote.api.MovieService
import com.rey.movies.data.source.remote.api.dto.MovieResponseDTO
import com.rey.movies.domain.dto.MovieResponse

internal class MovieRemoteDataImpl(
    private val service: MovieService,
    private val moviesRespMapper: ResponseMapper<List<MovieResponseDTO>, List<MovieResponse>>
) : MovieRemoteData {
    override suspend fun getMovies(): Result<List<MovieResponse>> = suspendTryCatch {
        val dto = service.getMovies()
        moviesRespMapper.mapResponse(dto)
    }
}